package com.james.wee.linkssq.util;

import java.util.HashMap;
import java.util.Map;

public class T {

	public static void main(String[] args) {
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
				thrMap.put("thr0", thrMap.get("thr0") + " " + (i<10?"0"+i:i));
			} else if (i % 3 == 2) {
				thrMap.put("thr2", thrMap.get("thr2") + " " + (i<10?"0"+i:i));
			} else if (i % 3 == 1) {
				thrMap.put("thr1", thrMap.get("thr1") + " " + (i<10?"0"+i:i));
			}

			if (i % 4 == 0) {
				furMap.put("fur0", furMap.get("fur0") + " " + (i<10?"0"+i:i));
			} else if (i % 4 == 1) {
				furMap.put("fur1", furMap.get("fur1") + " " + (i<10?"0"+i:i));
			} else if (i % 4 == 2) {
				furMap.put("fur2", furMap.get("fur2") + " " + (i<10?"0"+i:i));
			} else if (i % 4 == 3) {
				furMap.put("fur3", furMap.get("fur3") + " " + (i<10?"0"+i:i));
			}

			if (i % 5 == 0) {
				fveMap.put("fve0", fveMap.get("fve0") + " " + (i<10?"0"+i:i));
			} else if (i % 5 == 1) {
				fveMap.put("fve1", fveMap.get("fve1") + " " + (i<10?"0"+i:i));
			} else if (i % 5 == 2) {
				fveMap.put("fve2", fveMap.get("fve2") + " " + (i<10?"0"+i:i));
			} else if (i % 5 == 3) {
				fveMap.put("fve3", fveMap.get("fve3") + " " + (i<10?"0"+i:i));
			}else if (i % 5 == 4) {
				fveMap.put("fve4", fveMap.get("fve4") + " " + (i<10?"0"+i:i));
			}
		}
		
		System.out.println(thrMap);
		System.out.println(furMap);
		System.out.println(fveMap);
	}

}
