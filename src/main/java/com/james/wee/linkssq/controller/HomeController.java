package com.james.wee.linkssq.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.repository.dao.FunnelDao;
import com.james.wee.linkssq.repository.dao.PresentDataDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Resource
	private PresentDataDao presentDataDao;
	@Resource
	private FunnelDao funnelDao;
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	public PresentDataDao getPresentDataDao() {
		return presentDataDao;
	}

	public void setPresentDataDao(PresentDataDao presentDataDao) {
		this.presentDataDao = presentDataDao;
	}

	public FunnelDao getFunnelDao() {
		return funnelDao;
	}

	public void setFunnelDao(FunnelDao funnelDao) {
		this.funnelDao = funnelDao;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		List<Presentdata> presentList = presentDataDao.queryAllPresentData();
		String value = null;
		if(null!=presentList){
			for(Presentdata present : presentList){
				value = funnelDao.queryFunnelByOpenData(present);
				logger.info(present.getPresentSeries()+"=>共同值："+value);
			}
		}
		return "home";
	}

}
