/**
 * 
 */
package com.james.wee.linkssq.repository.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.james.wee.linkssq.model.CrossModel;
import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.repository.dao.PresentDataDao;
import com.james.wee.linkssq.util.HtmlParse;

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

	public List<Map.Entry<String, Integer>> countPresentData(int groups,
			int index) {
		return presentDataDao.countPresentData(groups, index);
	}

	public List<Presentdata> queryAllPresentData() {
		return presentDataDao.queryAllPresentData();
	}

	public Map<String, Map<String, CrossModel>> crossCount() {
		Map<String, Map<String, CrossModel>> res = new TreeMap<String, Map<String, CrossModel>>();
		Map<String, String> map = HtmlParse.crossAlltoReds();
		Map<String, CrossModel> mc =null;
		List<Presentdata> list = queryPresentDataForPage(5, 1, 0);
		for (Presentdata present : list) {
			mc = new HashMap<String, CrossModel>();
			// 3区
			CrossModel cmMal3 = new CrossModel(present, map.get("malThr0"),
					map.get("malThr1"), map.get("malThr2"), null, null);
			mc.put("mal3", cmMal3);
			// cross 3
			CrossModel cmCross3 = new CrossModel(present, map.get("thr0"),
					map.get("thr1"), map.get("thr2"), null, null);
			mc.put("cross3", cmCross3);
			// 4区
			CrossModel cmMal4 = new CrossModel(present, map.get("malFurr0"),
					map.get("malFurr1"), map.get("malFurr2"),
					map.get("malFurr3"), null);
			mc.put("mal4", cmMal4);
			// cross 4
			CrossModel cmCross4 = new CrossModel(present, map.get("fur0"),
					map.get("fur1"), map.get("fur2"), map.get("fur3"), null);
			mc.put("cross4", cmCross4);
			// 5区
			CrossModel cmMal5 = new CrossModel(present, map.get("malFve0"),
					map.get("malFve1"), map.get("malFve2"), map.get("malFve3"),
					map.get("malFve4"));
			mc.put("mal5", cmMal5);
			// cross 5
			CrossModel cmCross5 = new CrossModel(present, map.get("fve0"),
					map.get("fve1"), map.get("fve2"), map.get("fve3"),
					map.get("fve4"));
			mc.put("cross5", cmCross5);
			res.put(present.getPresentSeries(), mc);
		}
		return res;
	}
	
	
}
