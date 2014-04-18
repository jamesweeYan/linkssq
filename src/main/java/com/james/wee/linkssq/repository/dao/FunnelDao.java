/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
		List<String> refList = new ArrayList<String>();
		List<String> delList = new ArrayList<String>();
		List<Integer> idList = new ArrayList<Integer>();
		PropertyDescriptor pd = null;
		String key = "";
		String value = "";
		for (Funnel fun : funList) {
			idList.add(fun.getId());
			for (int i = 1; i <= 33; i++) {
				if (i < 10) {
					key = "0" + i;
				} else {
					key = "" + i;
				}
				try {
					pd = new PropertyDescriptor("r" + key, Funnel.class);
					value = (String) pd.getReadMethod().invoke(fun);
					if (null == value) {
						if (!delList.contains(key))
							delList.add(key);
					} else {
						if (!refList.contains(value))
							refList.add(value);
					}
				} catch (Exception e) {
					logger.info("读取属性值出现异常：" + e.getMessage());
				}
			}
		}
		// 读取共同值
		refList.removeAll(delList);
		java.util.Collections.sort(refList, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().compareTo(o2.toString());
			}

		});
		return idList.toString() + "|" + refList.toString();
	}

}
