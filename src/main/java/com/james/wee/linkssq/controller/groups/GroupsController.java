package com.james.wee.linkssq.controller.groups;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
import com.james.wee.linkssq.repository.service.CntService;
import com.james.wee.linkssq.repository.service.FunDataService;
import com.james.wee.linkssq.repository.service.PresentDataService;

@Controller
public class GroupsController {
	@Resource
	private PresentDataService presentDataService;
	@Resource
	private FunDataService funDataService;
	@Resource
	private CntService cntService;

	// private static final Logger logger = LoggerFactory
	// .getLogger(GroupsController.class);

	@RequestMapping(value = "/groupsCnt", method = RequestMethod.POST)
	public String groupsCnt(@RequestParam("qv") String qv,
			@RequestParam("qt") String qt, @RequestParam("depth") String depth,
			@RequestParam("isasc") String isasc, Model model) {
		List<CntModel> cmList = new ArrayList<CntModel>();
		if (null == qv || "".equals(qv))
			qv = "29";
		if (null == qt || "".equals(qt)) {
			qt = "0";
		}
		if (null == depth || "".equals(depth)) {
			depth = "33";
		}
		int step = Integer.parseInt(qt);
		// for (int j = 0; j < Integer.parseInt(depth); j++) {
		for (int j = Integer.parseInt(depth) - 1; j >= 0; j--) {
			CntModel cm = new CntModel();
			if ((step + j) > 0) {
				List<Presentdata> presentList = presentDataService
						.queryPresentDataForPage(1, 1, (step + j) - 1);
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
					//
					String ref = funDataService
							.queryFunnelByOpenData(presentList.get(0));
					// logger.info("+==============" + ref);
					String[] rs = ref.split("@");
					cm.setZuMaIds(rs[0]);
					cm.setZuMaReds(rs[1]);
				}

			}
			List<Map.Entry<String, Integer>> groups5 = presentDataService
					.countPresentData(Integer.parseInt(qv), (step + j));
			List<String> one = new ArrayList<String>();
			List<String> two = new ArrayList<String>();
			List<String> thr = new ArrayList<String>();
			for (Map.Entry<String, Integer> me : groups5) {
				if (one.size() != 11) {
					one.add(me.getKey());
				} else if (two.size() != 11) {
					two.add(me.getKey());
				} else {
					thr.add(me.getKey());
				}
			}
			if (isasc.equals("Y")) {
				java.util.Collections.sort(one, (a, b) -> a.compareTo(b));
				java.util.Collections.sort(two, (a, b) -> a.compareTo(b));
				java.util.Collections.sort(thr, (a, b) -> a.compareTo(b));
			}
			cm.setGroups_one(one);
			cm.setGroups_two(two);
			cm.setGroups_thr(thr);
			cmList.add(cm);
		}
		model.addAttribute("cmList", cmList);
		return "protecteds/ssqcnt/cnt";
	}

	@RequestMapping(value = "/cntLine", method = RequestMethod.POST)
	public String cntLine(Model model) {
		List<Double> d5 = new ArrayList<Double>();
		List<Double> d10 = new ArrayList<Double>();
		List<Double> d25 = new ArrayList<Double>();
		List<Double> d50 = new ArrayList<Double>();
		
		for (int i = 1; i <= 10; i++) {
			List<Map.Entry<String, Integer>> groups5 = presentDataService
					.countPresentData(5, i);

			List<Map.Entry<String, Integer>> groups10 = presentDataService
					.countPresentData(10, i);

			List<Map.Entry<String, Integer>> groups25 = presentDataService
					.countPresentData(25, i);

			List<Map.Entry<String, Integer>> groups50 = presentDataService
					.countPresentData(50, i);
//			for (int i = 0; i < 33; i++) {
//				d5.add(divide(groups5.get(i).getValue().intValue(), 5));
//				d10.add(divide(groups10.get(i).getValue().intValue(), 10));
//				d25.add(divide(groups25.get(i).getValue().intValue(), 25));
//				d50.add(divide(groups50.get(i).getValue().intValue(), 50));
//			}
		}
	
		model.addAttribute("line25", d25);
		model.addAttribute("line10", d10);
		model.addAttribute("line5", d5);
		model.addAttribute("line50", d50);

		return "protecteds/ssqcnt/line";
	}

	public double divide(int a, int b) {
		return new BigDecimal(a).divide(new BigDecimal(b), 2,
				RoundingMode.HALF_UP).doubleValue();
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

	public CntService getCntService() {
		return cntService;
	}

	public void setCntService(CntService cntService) {
		this.cntService = cntService;
	}

	// private int isNull(Integer i) {
	// return null == i ? 0 : i;
	// }
}
