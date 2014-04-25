package com.james.wee.linkssq.repository.task;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.james.wee.linkssq.repository.service.LottoDataService;

public class UpdateLottoOpenDataJob {
	private static final Logger logger = LoggerFactory
			.getLogger(UpdateLottoOpenDataJob.class);
	@Resource
	private LottoDataService lottoDataService;
	public LottoDataService getLottoDataService() {
		return lottoDataService;
	}

	public void setLottoDataService(LottoDataService lottoDataService) {
		this.lottoDataService = lottoDataService;
	}

	public void work() {
		logger.info("======================开始执行调度任务更新大乐透最新开奖数据=========================");
		this.lottoDataService.updateLastOpenData();
		logger.info("======================结束执行调度任务更新大乐透最新开奖数据=========================");
		
//		List<Presentdata> list = presentDataService.queryPresentDataForPage(1,
//				1, 0);
//		Presentdata present = list.get(0);
//		String[] reds = present.getOpenRedNums().split(" ");
//		String frequency = "";
//		Cnt cnt = new Cnt();
//		cnt.setOpenseries(present.getPresentSeries());
//		List<Map.Entry<String, Integer>> groups5 = presentDataService
//				.countPresentData(29, 0);
//		for (String r : reds) {
//			frequency += " " + (null == groups5.get(r) ? "0" : groups5.get(r));
//		}
//		String[] fq = frequency.trim().split(" ");
//		cnt.setP1(Integer.parseInt(fq[0]));
//		cnt.setP2(Integer.parseInt(fq[1]));
//		cnt.setP3(Integer.parseInt(fq[2]));
//		cnt.setP4(Integer.parseInt(fq[3]));
//		cnt.setP5(Integer.parseInt(fq[4]));
//		cnt.setP6(Integer.parseInt(fq[5]));
//		this.cntService.addCnt(cnt);
	}
}
