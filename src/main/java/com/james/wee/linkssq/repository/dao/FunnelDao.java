/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Funnel;
import com.james.wee.linkssq.model.Presentdata;

/**
 * @author James
 *
 */
@Repository("funnelDao")
public class FunnelDao {
	private static final Logger logger = LoggerFactory
			.getLogger(FunnelDao.class);
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public String queryFunnelByOpenData(Presentdata openData) {
		String sql = "SELECT f FROM Funnel f where f.r" + openData.getR1()
				+ "=:R1 " + " and  f.r" + openData.getR2() + "=:R2 "
				+ " and  f.r" + openData.getR3() + "=:R3 " + " and  f.r"
				+ openData.getR4() + "=:R4 " + " and  f.r" + openData.getR5()
				+ "=:R5 " + " and  f.r" + openData.getR6() + "=:R6 ";
		Query query = entityManager.createQuery(sql);
		query.setParameter("R1", openData.getR1());
		query.setParameter("R2", openData.getR2());
		query.setParameter("R3", openData.getR3());
		query.setParameter("R4", openData.getR4());
		query.setParameter("R5", openData.getR5());
		query.setParameter("R6", openData.getR6());
		List<Funnel> funList = query.getResultList();
		Map<String, Integer> tmp = new HashMap<String, Integer>();
		PropertyDescriptor pd = null;
		String key = "";
		String value = "";
		for (Funnel fun : funList) {
			for (int i = 1; i <= 29; i++) {
				if (i < 10) {
					key = "0" + i;
				} else {
					key = "" + i;
				}
				try {
					pd = new PropertyDescriptor("r" + key, Funnel.class);
					value = (String) pd.getReadMethod().invoke(fun);
					if (tmp.get(value) == null)
						tmp.put(value, 1);
					else {
						Integer index = tmp.get(value);
						tmp.put(value, (index + 1));
					}
				} catch (Exception e) {
					logger.info("读取属性值出现异常：" + e.getMessage());
				}
			}
		}
		// 读取共同值
		int size = funList.size();
		String r = "";
		List<String> refList = new ArrayList<String>();
		for (java.util.Iterator<String> it = tmp.keySet().iterator(); it
				.hasNext();) {
			r = it.next();
			if (tmp.get(r).intValue() == size) {
				refList.add(r);
			}
		}
		java.util.Collections.sort(refList, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().compareTo(o2.toString());
			}
			
		});
		return refList.toString();
	}

}
