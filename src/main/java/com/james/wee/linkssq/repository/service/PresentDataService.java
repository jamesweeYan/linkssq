/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.james.wee.linkssq.repository.dao.PresentDataDao;

/**
 * @author James
 *
 */
@Service
public class PresentDataService {
	@Resource
	private PresentDataDao presentDataDao;

	public PresentDataDao getPresentDataDao() {
		return presentDataDao;
	}

	public void setPresentDataDao(PresentDataDao presentDataDao) {
		this.presentDataDao = presentDataDao;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updatePresentDataByLast() {
		return presentDataDao.updateLastOpenData();
	}
}
