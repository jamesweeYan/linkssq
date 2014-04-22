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
	private static final Logger logger = LoggerFactory
			.getLogger(GroupsController.class);

	@RequestMapping(value = "/groupsCnt", method = RequestMethod.POST)
	public String groupsCnt(@RequestParam("qv") String qv,
			@RequestParam("qt") String qt,@RequestParam("depth") String depth, Model model) {
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
		for (int j = 0; j < Integer.parseInt(depth); j++) {
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
					logger.info("+==============" + ref);
					String[] rs = ref.split("@");
					cm.setZuMaIds(rs[0]);
					cm.setZuMaReds(rs[1]);
				}

			}
			List<Map.Entry<String, Integer>> groups5 = presentDataService.countPresentData(
					Integer.parseInt(qv), (step + j));
//			if (null != cm.getRedNum()) {
//				String[] reds = cm.getRedNum().split(" ");
//				String frequency = "";
//				for (String r : reds) {
//					frequency += " "
//							+ (null == groups5.get(r) ? "0" : groups5.get(r));
//				}
//				cm.setFrequency(frequency);
//			
//			}
//			Set<String> keys = groups5.keySet();
			List<String> one = new ArrayList<String>();
			List<String> two = new ArrayList<String>();
			List<String> thr = new ArrayList<String>();
//			for (java.util.Iterator<String> it = keys.iterator(); it.hasNext();) {
//				if(one.size()!=11){
//					one.add(it.next());
//				}else if(two.size()!=11){
//					two.add(it.next());
//				}else{
//					thr.add(it.next());
//				}
//			}
			for(Map.Entry<String, Integer> me : groups5){
				if(one.size()!=11){
					one.add(me.getKey());
				}else if(two.size()!=11){
					two.add(me.getKey());
				}else{
					thr.add(me.getKey());
				}
			}
			java.util.Collections.sort(one, (a,b)->a.compareTo(b));
			java.util.Collections.sort(two, (a,b)->a.compareTo(b));
			java.util.Collections.sort(thr, (a,b)->a.compareTo(b));
			cm.setGroups_one(one);
			cm.setGroups_two(two);
			cm.setGroups_thr(thr);
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

	public CntService getCntService() {
		return cntService;
	}

	public void setCntService(CntService cntService) {
		this.cntService = cntService;
	}

//	private int isNull(Integer i) {
//		return null == i ? 0 : i;
//	}
}
