/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.repository.dao.FunnelDao;

/**
 * @author JamesWeeYan
 *
 */
@Service
public class FunDataService {
	@Resource
	private FunnelDao funnelDao;

	public FunnelDao getFunnelDao() {
		return funnelDao;
	}

	public void setFunnelDao(FunnelDao funnelDao) {
		this.funnelDao = funnelDao;
	}

	public String queryFunnelByOpenData(Presentdata openData) {
		return funnelDao.queryFunnelByOpenData(openData);
	}
}
