/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Funnel;
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
		try {
			String open = HtmlParse.parseOpenSSQData();
			if (null != open) {
				Presentdata present = new Presentdata(open);
				logger.info("present====>" + present);
				entityManager.persist(present);
			}
		} catch (Exception e) {
			logger.info("更新最新开奖数据出现异常：" + e.getMessage());
			flag = false;
		}
		return flag;
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
	 *            数据的索引
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Presentdata> queryPresentDataForPage(int pageSize,
			int currageNo, int index) {
		Query query =  entityManager
				.createQuery(
						"SELECT p FROM Presentdata p ORDER BY p.id DESC");
		query.setFirstResult((currageNo-1)*pageSize+1);
		query.setMaxResults(pageSize);
		return query.getResultList();
		
	}

	public Map<String, Integer> countPresentData(int groups) {
		List<Presentdata> list = queryPresentDataForPage(groups, 1, 1);
		Map<String, Integer> cntMap = new TreeMap<String, Integer>();
		PropertyDescriptor pd = null;
		String value = null;
		if (null != list) {
			logger.info("====查询：" + list.size());
			for (Presentdata present : list) {
				for (int i = 1; i <= 6; i++) {
					try {
						pd = new PropertyDescriptor("r" + i, Presentdata.class);
						value = (String) pd.getReadMethod().invoke(present);
						if (cntMap.get(value) != null)
							cntMap.put(value, cntMap.get(value).intValue() + 1);
						else
							cntMap.put(value, 1);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		return cntMap;
	}
}
