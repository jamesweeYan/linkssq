package com.james.wee.linkssq.repository.task;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.james.wee.linkssq.repository.service.PresentDataService;

public class UpdateOpenDataJob {
	private static final Logger logger = LoggerFactory
			.getLogger(UpdateOpenDataJob.class);
	@Resource
	private PresentDataService presentDataService;

	public PresentDataService getPresentDataService() {
		return presentDataService;
	}

	public void setPresentDataService(PresentDataService presentDataService) {
		this.presentDataService = presentDataService;
	}

	public void work() {
		logger.info("======================开始执行调度任务更新最新开奖数据=========================");
		this.presentDataService.updatePresentDataByLast();
		logger.info("======================结束执行调度任务更新最新开奖数据=========================");
	}
}
