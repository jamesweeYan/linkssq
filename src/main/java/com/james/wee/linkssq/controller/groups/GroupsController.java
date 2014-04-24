package com.james.wee.linkssq.controller.groups;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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

	private Map<String, Object> countInterval(List<Presentdata> presentList) {
		Map<String, Object> res = new HashMap<String, Object>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, String> newmap = new HashMap<String, String>();
		for (int i = 0; i < 5; i++)
			map.put("0" + i, 0);
		Presentdata first = null;// presentList.get(0);
		String reds = "";
		List<String> tmp = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			first = presentList.get(i);
			String firstreds[] = first.getOpenRedNums().split(" ");

			for (String red : firstreds) {
				int index = 0;
				for (int j = 1 + i, len = presentList.size(); j < (len + i - 4); j++) {
					index = j;
					reds = presentList.get(j).getOpenRedNums();
					if (reds.indexOf(red) != -1) {
						map.put("0" + (j - i - 1),
								map.get("0" + (j - i - 1)) + 1);
						break;
					}
				}
//				if (index == (presentList.size() + i - 6)) {
//					map.put("05", map.get("05") + 1);
//				}
			}

			
			String str = "";
//			String space = "<span>";
			for (int k=0,len=firstreds.length;k<len;k++) {
				if (!tmp.contains(firstreds[k])){
					tmp.add(firstreds[k]);
					str+="<span>"+firstreds[k]+"</span>&nbsp;";
//					space=" ";
				}
			}
			newmap.put("0" + i, str);
		}
		res.put("intervalMap", map);
		res.put("redInterval", newmap);
		return res;
	}

	@RequestMapping(value = "/cntInterval", method = RequestMethod.POST)
	public String cntInterval(@RequestParam("qv") String qv,
			@RequestParam("qt") String qt, @RequestParam("depth") String depth,
			@RequestParam("isasc") String isasc, Model model) {
		List<CntModel> cmList = new ArrayList<CntModel>();
		if (null == depth || "".equals(depth)) {
			depth = "33";
		}
		int step = Integer.parseInt(qt);
		//List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		for (int j = Integer.parseInt(depth) - 1; j >= 0; j--) {
			CntModel cm = new CntModel();
			if ((step + j) > 0) {
				List<Presentdata> presentList = presentDataService
						.queryPresentDataForPage(1, 1, (step + j) - 1);
				if (null != presentList && !presentList.isEmpty()) {
					cm.setOpenNumDate(presentList.get(0).getPresentDate());
					cm.setOpenNumSeries(presentList.get(0).getPresentSeries());
					cm.setOpenNum(presentList.get(0).getOpenNums());
					cm.setRedNum(presentList.get(0).getOpenRedNums());
				}

			}

			List<Presentdata> presentList = presentDataService
					.queryPresentDataForPage(10, 1, (step + j));
			Map<String, Object> map = countInterval(presentList);
			// 对结果进行升序排序
			List<Map.Entry<String, Integer>> listMap = new ArrayList<Map.Entry<String, Integer>>(
					((Map<String, Integer>)map.get("intervalMap")).entrySet());
			java.util.Collections.sort(listMap,
					(a, b) -> a.getValue() - b.getValue()); 

			//取红球
			Map<String,String> redMap = (Map<String, String>)map.get("redInterval");
			
			int zero = listMap.get(0).getValue();
			int one  = listMap.get(1).getValue();
			int two  = listMap.get(2).getValue();
			int thr =  listMap.get(3).getValue();
			int fur =  listMap.get(4).getValue();
			String keys = "";
			String d = "";
			if(zero==two){
				keys +=d+listMap.get(0).getKey(); 
				d=",";
				keys+=d+listMap.get(1).getKey(); 
				keys+=d+listMap.get(2).getKey(); 
			}else{
				if(zero==one){
					keys +=d+listMap.get(0).getKey(); 
					d=",";
					keys+=d+listMap.get(1).getKey(); 
				}else{
					keys +=d+listMap.get(0).getKey(); 
					d=",";
				}
					
			}
			
			if(two==fur){
				if(zero!=two){
				keys +=d+listMap.get(2).getKey(); 
				
				keys+=d+listMap.get(3).getKey(); 
				keys+=d+listMap.get(4).getKey(); 
				}else{
					keys+=d+listMap.get(3).getKey(); 
					d=",";
					keys+=d+listMap.get(4).getKey(); 
				}
			}else{
				if(thr==fur){
					keys+=d+listMap.get(3).getKey(); 
					d=",";
					keys+=d+listMap.get(4).getKey(); 
				}else{
					keys+=d+listMap.get(4).getKey(); 
					d=",";
				}
			}
			
//			String firstKey = listMap.get(0).getKey();
//			String lastKey =listMap.get(listMap.size()-1).getKey();
			String[] k = keys.split(",");
			String reds ="";
			for(String e : k){
			 reds +=  redMap.get(e);
			//判断是否有重复项

			}
			cm.setSpanReds(reds);
			cmList.add(cm);
		}
		model.addAttribute("cmList", cmList);
		return "protecteds/ssqcnt/interval";
	}

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
		List<Double> tmp5 = null;
		List<Double> tmp10 = null;
		List<Double> tmp25 = null;
		List<Double> tmp50 = null;
		Map<String, List<Double>> mapList = new HashMap<String, List<Double>>();
		String key = "";
		for (int j = 1; j <= 33; j++) {
			tmp5 = new ArrayList<Double>();
			tmp10 = new ArrayList<Double>();
			tmp25 = new ArrayList<Double>();
			tmp50 = new ArrayList<Double>();
			if (j < 10)
				key = "0" + j;
			else
				key = "" + j;
			for (int i = 9; i >= 0; i--) {
				List<Map.Entry<String, Integer>> groups5 = presentDataService
						.countPresentData(5, i);
				for (Map.Entry<String, Integer> m : groups5) {
					if (m.getKey().equals(key)) {
						tmp5.add(this.divide(m.getValue(), 5));
						break;
					}
				}
				List<Map.Entry<String, Integer>> groups10 = presentDataService
						.countPresentData(10, i);
				for (Map.Entry<String, Integer> m : groups10) {
					if (m.getKey().equals(key)) {
						tmp10.add(this.divide(m.getValue(), 10));
						break;
					}
				}
				List<Map.Entry<String, Integer>> groups25 = presentDataService
						.countPresentData(25, i);
				for (Map.Entry<String, Integer> m : groups25) {
					if (m.getKey().equals(key)) {
						tmp25.add(this.divide(m.getValue(), 25));
						break;
					}
				}
				List<Map.Entry<String, Integer>> groups50 = presentDataService
						.countPresentData(50, i);
				for (Map.Entry<String, Integer> m : groups50) {
					if (m.getKey().equals(key)) {
						tmp50.add(this.divide(m.getValue(), 50));
						break;
					}
				}
			}
			mapList.put(key + "_5", tmp5);
			mapList.put(key + "_10", tmp10);
			mapList.put(key + "_25", tmp25);
			mapList.put(key + "_50", tmp50);
		}

		model.addAttribute("redMapList", mapList);
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

}
