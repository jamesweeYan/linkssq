package com.james.wee.linkssq.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.james.wee.linkssq.repository.dao.PresentDataDao;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/linkssq")
public class HomeController {

	@Resource
	private PresentDataDao presentDataDao;
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	public PresentDataDao getPresentDataDao() {
		return presentDataDao;
	}

	public void setPresentDataDao(PresentDataDao presentDataDao) {
		this.presentDataDao = presentDataDao;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		boolean flag = presentDataDao.updateLastOpenData();
		model.addAttribute("serverTime", formattedDate+"=="+this.presentDataDao+"===="+flag);
		return "home";
	}

}
