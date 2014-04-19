package com.james.wee.linkssq.controller.groups;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.james.wee.linkssq.model.CntModel;
import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.repository.service.FunDataService;
import com.james.wee.linkssq.repository.service.PresentDataService;

@Controller
public class GroupsController {
	@Resource
	private PresentDataService presentDataService;
	@Resource
	private FunDataService funDataService;

	private static final Logger logger = LoggerFactory
			.getLogger(GroupsController.class);

	@RequestMapping(value = "/groupsCnt", method = RequestMethod.POST)
	public String groupsCnt(@RequestParam("qv") String qv,
			@RequestParam("qt") String qt, Model model) {
		List<CntModel> cmList = new ArrayList<CntModel>();
		if (null == qv || "".equals(qv))
			qv = "29";
		if (null == qt || "".equals(qt)) {
			qt = "0";
		}
		int step = Integer.parseInt(qt);
		for (int j = 0; j < 10; j++) {
			CntModel cm = new CntModel();
			step += j;
			if (step > 0) {
				List<Presentdata> presentList = presentDataService
						.queryPresentDataForPage(1, 1, step - 1);
				if (null != presentList && !presentList.isEmpty()) {
					// model.addAttribute("openNumDate", presentList.get(0)
					// .getPresentDate());
					cm.setOpenNumDate(presentList.get(0).getPresentDate());
					// model.addAttribute("openNumSeries", presentList.get(0)
					// .getPresentSeries());
					cm.setOpenNumSeries(presentList.get(0).getPresentSeries());
					// model.addAttribute("openNum",
					// presentList.get(0).getOpenNums());
					cm.setOpenNum(presentList.get(0).getOpenNums());
					// model.addAttribute("redNum",presentList.get(0).getOpenRedNums());
					cm.setRedNum(presentList.get(0).getOpenRedNums());
				}

			}
			Map<String, Integer> groups5 = presentDataService.countPresentData(
					Integer.parseInt(qv), step);
			String[] reds = cm.getRedNum().split(" ");
			String frequency = "";
			for(String r : reds){
				frequency+=" "+groups5.get(r);
			}
			cm.setFrequency(frequency);
			List<Integer> one = new ArrayList<Integer>();
			for (int i = 1; i <= 11; i++) {
				if (i < 10)
					one.add(isNull(groups5.get("0" + i)));
				else
					one.add(isNull(groups5.get("" + i)));
			}
			// model.addAttribute("groups_one", one);
			cm.setGroups_one(one);
			List<Integer> two = new ArrayList<Integer>();
			for (int i = 12; i <= 22; i++) {
				two.add(isNull(groups5.get("" + i)));
			}
			// model.addAttribute("groups_two", two);
			cm.setGroups_two(two);
			List<Integer> thr = new ArrayList<Integer>();
			for (int i = 23; i <= 33; i++) {
				thr.add(isNull(groups5.get("" + i)));
			}
			// model.addAttribute("groups_thr", thr);
			cm.setGroups_thr(thr);
			List<Presentdata> list = presentDataService
					.queryPresentDataForPage(Integer.parseInt(qv), 1, step);
			if (null != list) {
				for (Presentdata prest : list) {
					String ref = funDataService.queryFunnelByOpenData(prest);
					logger.info("+==============" + ref);
					String[] rs = ref.split("@");
					// model.addAttribute("zuMaIds", rs[0]);
					// model.addAttribute("zuMaReds", rs[1]);
					cm.setZuMaIds(rs[0]);
					cm.setZuMaReds(rs[1]);
				}
			}
			cmList.add(cm);
		}
		model.addAttribute("cmList", cmList);
		return "protecteds/ssqcnt/cnt";
	}

	public PresentDataService getPresentDataService() {
		return presentDataService;
	}

	public void setPresentDataService(PresentDataService presentDataService) {
		this.presentDataService = presentDataService;
	}

	public FunDataService getFunDataService() {
		return funDataService;
	}

	public void setFunDataService(FunDataService funDataService) {
		this.funDataService = funDataService;
	}

	private int isNull(Integer i) {
		return null == i ? 0 : i;
	}
}
