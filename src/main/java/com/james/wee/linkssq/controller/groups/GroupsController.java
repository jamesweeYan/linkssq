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

import com.james.wee.linkssq.model.Cnt;
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
			@RequestParam("qt") String qt, Model model) {
		List<CntModel> cmList = new ArrayList<CntModel>();
		if (null == qv || "".equals(qv))
			qv = "29";
		if (null == qt || "".equals(qt)) {
			qt = "0";
		}
		int step = Integer.parseInt(qt);
		for (int j = 0; j < 33; j++) {
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
			Map<String, Integer> groups5 = presentDataService.countPresentData(
					Integer.parseInt(qv), (step + j));
			if (null != cm.getRedNum()) {
				String[] reds = cm.getRedNum().split(" ");
				String frequency = "";
//				Cnt cnt = new Cnt();
//				cnt.setOpenseries(cm.getOpenNumSeries());
//				
				for (String r : reds) {
					frequency += " "
							+ (null == groups5.get(r) ? "0" : groups5.get(r));
				}
//				String[] fq = frequency.trim().split(" ");
//				cnt.setP1(Integer.parseInt(fq[0]));
//				cnt.setP2(Integer.parseInt(fq[1]));
//				cnt.setP3(Integer.parseInt(fq[2]));
//				cnt.setP4(Integer.parseInt(fq[3]));
//				cnt.setP5(Integer.parseInt(fq[4]));
//				cnt.setP6(Integer.parseInt(fq[5]));
//				this.cntService.addCnt(cnt);
				cm.setFrequency(frequency);
			
			}
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
			cmList.add(cm);
		}
		model.addAttribute("cmList", cmList);
		return "protecteds/ssqcnt/cnt2";
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

	private int isNull(Integer i) {
		return null == i ? 0 : i;
	}
}
