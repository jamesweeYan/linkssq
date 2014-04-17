/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.util.List;

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
				logger.info("present====>"+present);
				entityManager.persist(present);
			}
		} catch (Exception e) {
			logger.info("更新最新开奖数据出现异常："+e.getMessage());
			flag = false;
		}
		return flag;
	}
	
	public List<Presentdata> queryAllPresentData(){
		Query query = entityManager.createNamedQuery("Presentdata.findAll");
		return query.getResultList();
	}
}
