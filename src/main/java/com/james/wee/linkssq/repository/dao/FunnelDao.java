/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

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
		String sql = "SELECT f FROM Funnel f where f.R_" + openData.getR1()
				+ " and  f.R_" + openData.getR2() + " and  f.R_"
				+ openData.getR3() + " and  f.R_" + openData.getR4()
				+ " and  f.R_" + openData.getR5() + " and  f.R_"
				+ openData.getR6();
		Query query = entityManager.createQuery(sql);
		List<Funnel> funList = query.getResultList();
		Map<String,String> tmp = new HashMap<String, String>();
		for(Funnel fun :funList){
			
		}
		return null;
	}
}
