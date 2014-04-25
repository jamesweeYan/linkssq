/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.james.wee.linkssq.model.Lottodata;
import com.james.wee.linkssq.repository.dao.LottoDao;

/**
 * @author James
 *
 */
@Service
public class LottoDataService {
	@Resource
	private LottoDao lottoDao;

	public LottoDao getLottoDao() {
		return lottoDao;
	}

	public void setLottoDao(LottoDao lottoDao) {
		this.lottoDao = lottoDao;
	}

	public boolean updateLastOpenData() {
		return lottoDao.updateLastOpenData();
	}

	public Lottodata queryLottoDataByOpenSeries(String series) {
		return lottoDao.queryLottoDataByOpenSeries(series);
	}

	public List<Lottodata> queryAllPresentData() {
		return lottoDao.queryAllPresentData();
	}

	public List<Lottodata> queryLottoDataForPage(int pageSize, int currageNo,
			int index) {
		return lottoDao.queryLottoDataForPage(pageSize, currageNo, index);
	}

	public List<Map.Entry<String, Integer>> countPresentData(int groups,
			int index) {
		return lottoDao.countPresentData(groups, index);
	}
}
