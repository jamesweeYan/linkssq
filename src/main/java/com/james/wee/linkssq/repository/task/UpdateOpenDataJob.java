package com.james.wee.linkssq.repository.task;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.james.wee.linkssq.model.Cnt;
import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.repository.service.CntService;
import com.james.wee.linkssq.repository.service.PresentDataService;

public class UpdateOpenDataJob {
	private static final Logger logger = LoggerFactory
			.getLogger(UpdateOpenDataJob.class);
	@Resource
	private PresentDataService presentDataService;
	@Resource
	private CntService cntService;

	public PresentDataService getPresentDataService() {
		return presentDataService;
	}

	public void setPresentDataService(PresentDataService presentDataService) {
		this.presentDataService = presentDataService;
	}

	public CntService getCntService() {
		return cntService;
	}

	public void setCntService(CntService cntService) {
		this.cntService = cntService;
	}

	public void work() {
		logger.info("======================开始执行调度任务更新最新开奖数据=========================");
		this.presentDataService.updatePresentDataByLast();
		logger.info("======================结束执行调度任务更新最新开奖数据=========================");
		List<Presentdata> list = presentDataService.queryPresentDataForPage(1,
				1, 0);
		Presentdata present = list.get(0);
		String[] reds = present.getOpenRedNums().split(" ");
		String frequency = "";
		Cnt cnt = new Cnt();
		cnt.setOpenseries(present.getPresentSeries());
		Map<String, Integer> groups5 = presentDataService
				.countPresentData(29, 0);
		for (String r : reds) {
			frequency += " " + (null == groups5.get(r) ? "0" : groups5.get(r));
		}
		String[] fq = frequency.trim().split(" ");
		cnt.setP1(Integer.parseInt(fq[0]));
		cnt.setP2(Integer.parseInt(fq[1]));
		cnt.setP3(Integer.parseInt(fq[2]));
		cnt.setP4(Integer.parseInt(fq[3]));
		cnt.setP5(Integer.parseInt(fq[4]));
		cnt.setP6(Integer.parseInt(fq[5]));
		this.cntService.addCnt(cnt);
	}
}
