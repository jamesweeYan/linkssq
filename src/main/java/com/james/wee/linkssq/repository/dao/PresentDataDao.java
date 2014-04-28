/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.util.HtmlParse;

/**
 * @author James
 *
 */
@Repository("presentDataDao")
public class PresentDataDao {

	private static final Logger logger = LoggerFactory
			.getLogger(PresentDataDao.class);
	private static final List<Presentdata> presentAllData = new ArrayList<Presentdata>();
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public boolean updateLastOpenData() {
		boolean flag = true;
		// try {
		String open = HtmlParse.parseOpenSSQData();
		if (null != open) {
			Presentdata present = new Presentdata(open);
			try {
				present = queryPresentDataByOpenSeries(present
						.getPresentSeries());
				presentAllData.clear();
				presentAllData.addAll(queryAllPresentData());
			} catch (Exception e) {
				try {
//					logger.info("present====>" + present);
					entityManager.persist(present);
				} catch (Exception es) {
					logger.info("更新最新开奖数据出现异常：" + es.getMessage());
					flag = false;
				}
			}
//			logger.info(present + " ====>已存在");

		}
		// } catch (Exception e) {
		// logger.info("更新最新开奖数据出现异常：" + e.getMessage());
		// flag = false;
		// }
		return flag;
	}

	public Presentdata queryPresentDataByOpenSeries(String series) {
		Query query = entityManager
				.createQuery("SELECT p FROM Presentdata p where p.presentSeries=:series");
		query.setParameter("series", series);
		return (Presentdata) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<Presentdata> queryAllPresentData() {
		Query query = entityManager.createNamedQuery("Presentdata.findAll");
		return query.getResultList();
	}

	/**
	 * 
	 * @param pageSize
	 * @param currageNo
	 * @param index
	 *            
	 * @return
	 */
//	@SuppressWarnings("unchecked")
	public List<Presentdata> queryPresentDataForPage(int pageSize,
			int currageNo, int index) {
		if(presentAllData.isEmpty()){
			presentAllData.addAll(queryAllPresentData());
		}
//		Query query = entityManager
//				.createQuery("SELECT p FROM Presentdata p ORDER BY p.id DESC");
//		query.setFirstResult((currageNo - 1) * pageSize + index);
//		query.setMaxResults(pageSize);
//		return query.getResultList();
		return presentAllData.subList((currageNo - 1) * pageSize + index, (currageNo - 1) * pageSize + index+pageSize);

	}

	public List<Map.Entry<String, Integer>> countPresentData(int groups, int index) {
		List<Presentdata> list = queryPresentDataForPage(groups, 1, index);
		Map<String, Integer> cntMap = new TreeMap<String, Integer>();
		for(int i=1;i<=33;i++){
			if(i<10)
				cntMap.put("0"+i, 0);
			else
				cntMap.put(""+i, 0);
		}
			
		PropertyDescriptor pd = null;
		String value = null;
		if (null != list) {
//			logger.info("====查询：" + list);
			for (Presentdata present : list) {
				for (int i = 1; i <= 6; i++) {
					try {
						pd = new PropertyDescriptor("r" + i, Presentdata.class);
						value = (String) pd.getReadMethod().invoke(present);
						cntMap.put(value, cntMap.get(value).intValue() + 1);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		List<Map.Entry<String, Integer>> listMap = new ArrayList<Map.Entry<String, Integer>>(cntMap.entrySet());
		java.util.Collections.sort(listMap,(a,b)-> b.getValue()-a.getValue());
//		logger.info("====查询统计：" + listMap);
		return listMap;
	}
}
