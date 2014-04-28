package com.james.wee.linkssq.util;

import java.util.HashMap;
import java.util.Map;

public class T {

	public static void main(String[] args) {
		Map<String, String> malThrMap = new HashMap<String, String>();
		malThrMap.put("malThr0", "");
		malThrMap.put("malThr1", "");
		malThrMap.put("malThr2", "");
		String t = "";
       for(int i=1;i<=33;i++){
    	   if(i<10)
    		   t="0"+i;
    	   else
    		   t=""+i;
    	   if(i<=11)
    		   malThrMap.put("malThr0", malThrMap.get("malThr0")+" "+t);
    	   else if(i>11 && i<=22)
    		   malThrMap.put("malThr1", malThrMap.get("malThr1")+" "+t);
    	   else 
    		   malThrMap.put("malThr2", malThrMap.get("malThr2")+" "+t);
       }
		Map<String, String> malfurMap = new HashMap<String, String>();
		malfurMap.put("malFurr0", "");
		malfurMap.put("malFurr1", "");
		malfurMap.put("malFurr2", "");
		malfurMap.put("malFurr3", "");
		
	      for(int i=1;i<=33;i++){
	    	   if(i<10)
	    		   t="0"+i;
	    	   else
	    		   t=""+i;
	    	   if(i<=8)
	    		   malfurMap.put("malFurr0", malfurMap.get("malFurr0")+" "+t);
	    	   else if(i>8 && i<=16)
	    		   malfurMap.put("malFurr1", malfurMap.get("malFurr1")+" "+t);
	    	   else if(i>16 && i<=24)
	    		   malfurMap.put("malFurr2", malfurMap.get("malFurr2")+" "+t);
	    	   else
	    		   malfurMap.put("malFurr3", malfurMap.get("malFurr3")+" "+t);
	       }
		Map<String, String> malfveMap = new HashMap<String, String>();
		malfveMap.put("malFve0", "");
		malfveMap.put("malFve1", "");
		malfveMap.put("malFve2", "");
		malfveMap.put("malFve3", "");
		malfveMap.put("malFve4", "");
	      for(int i=1;i<=33;i++){
	    	   if(i<10)
	    		   t="0"+i;
	    	   else
	    		   t=""+i;
	    	   if(i<=6)
	    		   malfveMap.put("malFve0", malfveMap.get("malFve0")+" "+t);
	    	   else if(i>6 && i<=13)
	    		   malfveMap.put("malFve1", malfveMap.get("malFve1")+" "+t);
	    	   else if(i>13 && i<=20)
	    		   malfveMap.put("malFve2", malfveMap.get("malFve2")+" "+t);
	    	   else if(i>20 && i<=27)
	    		   malfveMap.put("malFve3", malfveMap.get("malFve3")+" "+t);
	    	   else
	    		   malfveMap.put("malFve4", malfveMap.get("malFve4")+" "+t);
	       }
		Map<String, String> thrMap = new HashMap<String, String>();
		thrMap.put("thr0", "");
		thrMap.put("thr1", "");
		thrMap.put("thr2", "");

		Map<String, String> furMap = new HashMap<String, String>();
		furMap.put("fur0", "");
		furMap.put("fur1", "");
		furMap.put("fur2", "");
		furMap.put("fur3", "");
		Map<String, String> fveMap = new HashMap<String, String>();
		fveMap.put("fve0", "");
		fveMap.put("fve1", "");
		fveMap.put("fve2", "");
		fveMap.put("fve3", "");
		fveMap.put("fve4", "");
		for (int i = 1; i <= 33; i++) {
			if (i % 3 == 0) {
				thrMap.put("thr0", thrMap.get("thr0") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 3 == 2) {
				thrMap.put("thr2", thrMap.get("thr2") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 3 == 1) {
				thrMap.put("thr1", thrMap.get("thr1") + " "
						+ (i < 10 ? "0" + i : i));
			}

			if (i % 4 == 0) {
				furMap.put("fur0", furMap.get("fur0") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 4 == 1) {
				furMap.put("fur1", furMap.get("fur1") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 4 == 2) {
				furMap.put("fur2", furMap.get("fur2") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 4 == 3) {
				furMap.put("fur3", furMap.get("fur3") + " "
						+ (i < 10 ? "0" + i : i));
			}

			if (i % 5 == 0) {
				fveMap.put("fve0", fveMap.get("fve0") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 5 == 1) {
				fveMap.put("fve1", fveMap.get("fve1") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 5 == 2) {
				fveMap.put("fve2", fveMap.get("fve2") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 5 == 3) {
				fveMap.put("fve3", fveMap.get("fve3") + " "
						+ (i < 10 ? "0" + i : i));
			} else if (i % 5 == 4) {
				fveMap.put("fve4", fveMap.get("fve4") + " "
						+ (i < 10 ? "0" + i : i));
			}
		}

		System.out.println(thrMap);
		System.out.println(furMap);
		System.out.println(fveMap);
	}

}
