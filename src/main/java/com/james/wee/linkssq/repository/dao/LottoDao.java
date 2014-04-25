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
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Lottodata;
import com.james.wee.linkssq.util.HtmlParse;

/**
 * @author James
 *
 */

@Repository("lottoDao")
public class LottoDao {
	private static final Logger logger = LoggerFactory
			.getLogger(LottoDao.class);
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public boolean updateLastOpenData() {
		boolean flag = true;
		// try {
		String open = HtmlParse.parseOpenLottoData();
		if (null != open) {
			Lottodata lotto = new Lottodata(open);
			try {
				lotto = queryLottoDataByOpenSeries(lotto.getLottoSeries());
			} catch (Exception e) {
				try {
//					logger.info("present====>" + present);
					entityManager.persist(lotto);
				} catch (Exception es) {
					logger.info("更新大乐透最新开奖数据出现异常：" + es.getMessage());
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
	
	public Lottodata queryLottoDataByOpenSeries(String series) {
		Query query = entityManager
				.createQuery("SELECT p FROM Lottodata p where p.lottoSeries=:series");
		query.setParameter("series", series);
		return (Lottodata) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lottodata> queryAllPresentData() {
		Query query = entityManager.createNamedQuery("Lottodata.findAll");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lottodata> queryLottoDataForPage(int pageSize,
			int currageNo, int index) {
		Query query = entityManager
				.createQuery("SELECT p FROM Lottodata p ORDER BY p.id DESC");
		query.setFirstResult((currageNo - 1) * pageSize + index);
		query.setMaxResults(pageSize);
		return query.getResultList();

	}

	public List<Map.Entry<String, Integer>> countPresentData(int groups, int index) {
		List<Lottodata> list = queryLottoDataForPage(groups, 1, index);
		Map<String, Integer> cntMap = new TreeMap<String, Integer>();
		for(int i=1;i<=35;i++){
			if(i<10)
				cntMap.put("0"+i, 0);
			else
				cntMap.put(""+i, 0);
		}
			
		PropertyDescriptor pd = null;
		String value = null;
		if (null != list) {
//			logger.info("====查询：" + list);
			for (Lottodata present : list) {
				for (int i = 1; i <= 5; i++) {
					try {
						pd = new PropertyDescriptor("r" + i, Lottodata.class);
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
