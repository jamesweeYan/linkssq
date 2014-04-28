package com.james.wee.linkssq.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlParse {
	private static final Logger logger = LoggerFactory
			.getLogger(HtmlParse.class);

	public static void wb(String str) throws IOException {
		java.io.BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("E:\\ssq4.txt"),
					true));
			bw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			bw.close();
		}
	}

	public static String parseOpenLottoData() {
		String openData = null;
		URL url = null;
		try {
			url = new URL(
					"http://www.lottery.gov.cn/lottery/dlt/History.aspx?p=1");
		} catch (MalformedURLException e) {
			logger.info("url出现异常:==" + e.getMessage());
		}
		Document doc = null;
		try {
			doc = Jsoup.parse(url, 60000);
			Elements tables = doc.select("table");
			Element tab = tables.get(8);
			Elements tres = tab.select("tr");
			Element tr = null;
			Elements tdes = null;
			// for (int i = 2; i < tres.size(); i++) {
			tr = tres.get(2);// 取第一条
			tdes = tr.children();
			openData = (tdes.get(11).text() + " " + tdes.get(0).text() + " " + trim(tdes
					.get(1).text()));
			// }
		} catch (IOException e) {
			logger.info("连接网址出现异常:==" + e.getMessage());
		}
		return openData;
	}

	//
	public static String parseOpenSSQData() {
		String openData = null;
		// try {

		URL url = null;
		try {
			url = new URL(
					"http://kaijiang.zhcw.com/zhcw/inc/ssq/ssq_wqhg.jsp?pageNum=1");
		} catch (MalformedURLException e) {
			logger.info("url出现异常:==" + e.getMessage());
		}
		Document doc = null;
		try {
			doc = Jsoup.parse(url, 60000);
		} catch (IOException e) {
			logger.info("连接网址出现异常:==" + e.getMessage());
			try {
				doc = Jsoup.parse(url, 60000);
			} catch (IOException e1) {

				logger.info("再连接网址出现异常:==" + e.getMessage());
			}
		}
		Elements tdlink = doc.select("td");
		int index = 0;
		Element link = null;
		StringBuilder sbr = new StringBuilder();
		String dou = "";
		for (int i = 0, len = tdlink.size() - 1; i < len; i++) {
			link = tdlink.get(i);
			if (index < 3) {
				sbr.append(dou).append(link.text());
				dou = ",";
				index++;
				continue;
			} else if (index == 6) {
				sbr.append("\n");
				index = 0;
				dou = "";
				continue;
			} else {
				break;
				// index++;
				// continue;
			}
		}
		openData = sbr.toString().replaceAll(" ", ",");

		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		return openData;

	}

	private static String trim(String str) {
		String[] s = str.split("\\+");
		String[] a = s[0].split(" ");
		int calc = 0;
		for (String b : a) {
			calc += Integer.parseInt(b);
		}
		return (str.replaceAll("\\+ ", "")) + " " + calc;
	}

	public static void main(String[] args) {

		// try (java.io.BufferedWriter bw = new BufferedWriter(new FileWriter(
		// new File("e:\\lotto.csv"), true))) {
		// for (int j = 1;j < 23; j++) {
		URL url = null;
		try {
			url = new URL(
					"http://www.lottery.gov.cn/lottery/dlt/History.aspx?p=" + 1);
		} catch (MalformedURLException e) {
			logger.info("url出现异常:==" + e.getMessage());
		}
		Document doc = null;
		try {
			doc = Jsoup.parse(url, 60000);
			Elements tables = doc.select("table");
			Element tab = tables.get(8);
			Elements tres = tab.select("tr");
			Element tr = null;
			Elements tdes = null;
			for (int i = 2; i < tres.size(); i++) {
				tr = tres.get(i);
				tdes = tr.children();
				// System.out.println(tdes.get(11).text()+"===========>"+j);
				System.out.println(tdes.get(11).text() + " "
						+ tdes.get(0).text() + " " + trim(tdes.get(1).text()));
			}
		} catch (IOException e) {
			logger.info("连接网址出现异常:==" + e.getMessage());
		}
		// System.out.println("================="+j);
		// }
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// }
	}

	public static Map<String, String> crossAlltoReds() {
		Map<String, String> res = new HashMap<String, String>();
		Map<String, String> malThrMap = new HashMap<String, String>();
		malThrMap.put("malThr0", "");
		malThrMap.put("malThr1", "");
		malThrMap.put("malThr2", "");

		String t = "";
		for (int i = 1; i <= 33; i++) {
			if (i < 10)
				t = "0" + i;
			else
				t = "" + i;
			if (i <= 11)
				malThrMap.put("malThr0", malThrMap.get("malThr0") + " " + t);
			else if (i > 11 && i <= 22)
				malThrMap.put("malThr1", malThrMap.get("malThr1") + " " + t);
			else
				malThrMap.put("malThr2", malThrMap.get("malThr2") + " " + t);
		}
		Map<String, String> malfurMap = new HashMap<String, String>();
		malfurMap.put("malFurr0", "");
		malfurMap.put("malFurr1", "");
		malfurMap.put("malFurr2", "");
		malfurMap.put("malFurr3", "");

		for (int i = 1; i <= 33; i++) {
			if (i < 10)
				t = "0" + i;
			else
				t = "" + i;
			if (i <= 8)
				malfurMap.put("malFurr0", malfurMap.get("malFurr0") + " " + t);
			else if (i > 8 && i <= 16)
				malfurMap.put("malFurr1", malfurMap.get("malFurr1") + " " + t);
			else if (i > 16 && i <= 24)
				malfurMap.put("malFurr2", malfurMap.get("malFurr2") + " " + t);
			else
				malfurMap.put("malFurr3", malfurMap.get("malFurr3") + " " + t);
		}
		Map<String, String> malfveMap = new HashMap<String, String>();
		malfveMap.put("malFve0", "");
		malfveMap.put("malFve1", "");
		malfveMap.put("malFve2", "");
		malfveMap.put("malFve3", "");
		malfveMap.put("malFve4", "");

		for (int i = 1; i <= 33; i++) {
			if (i < 10)
				t = "0" + i;
			else
				t = "" + i;
			if (i <= 6)
				malfveMap.put("malFve0", malfveMap.get("malFve0") + " " + t);
			else if (i > 6 && i <= 13)
				malfveMap.put("malFve1", malfveMap.get("malFve1") + " " + t);
			else if (i > 13 && i <= 20)
				malfveMap.put("malFve2", malfveMap.get("malFve2") + " " + t);
			else if (i > 20 && i <= 27)
				malfveMap.put("malFve3", malfveMap.get("malFve3") + " " + t);
			else
				malfveMap.put("malFve4", malfveMap.get("malFve4") + " " + t);
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
		res.putAll(malThrMap);
		res.putAll(malfurMap);
		res.putAll(malfveMap);
		res.putAll(thrMap);
		res.putAll(furMap);
		res.putAll(fveMap);
		return res;

	}
}
