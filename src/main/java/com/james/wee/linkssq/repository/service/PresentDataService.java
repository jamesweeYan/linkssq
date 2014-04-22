/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.james.wee.linkssq.model.Presentdata;
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

	@Transactional(propagation = Propagation.REQUIRED)
	public boolean updatePresentDataByLast() {
		return presentDataDao.updateLastOpenData();
	}

	public Presentdata queryPresentDataByOpenSeries(String series) {
		return presentDataDao.queryPresentDataByOpenSeries(series);
	}

	public List<Presentdata> queryPresentDataForPage(int pageSize,
			int currageNo, int index) {
		return presentDataDao.queryPresentDataForPage(pageSize, currageNo,
				index);

	}

	public List<Map.Entry<String, Integer>> countPresentData(int groups, int index) {
		return presentDataDao.countPresentData(groups, index);
	}

	public List<Presentdata> queryAllPresentData() {
		return presentDataDao.queryAllPresentData();
	}
}
