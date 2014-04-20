/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Cnt;

/**
 * @author JamesWeeYan
 *
 */
@Repository("cntDao")
public class CntDao {
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public void addCnt(Cnt cnt){
		entityManager.persist(cnt);
	}
}
