/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.james.wee.linkssq.model.Cnt;
import com.james.wee.linkssq.repository.dao.CntDao;

/**
 * @author JamesWeeYan
 *
 */
@Service
public class CntService {
	@Resource
	private CntDao cntDao;

	public CntDao getCntDao() {
		return cntDao;
	}

	public void setCntDao(CntDao cntDao) {
		this.cntDao = cntDao;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void addCnt(Cnt cnt) {
		cntDao.addCnt(cnt);
	}
}
