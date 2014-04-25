package com.james.wee.linkssq.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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

	public static String parseOpenLottoData(){
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
//			for (int i = 2; i < tres.size(); i++) {
				tr = tres.get(2);//取第一条
				tdes = tr.children();
				openData=(tdes.get(11).text() + " "
						+ tdes.get(0).text() + " "
						+ trim(tdes.get(1).text()));
//			}
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
		return (str.replaceAll("\\+ ", ""))+" "
				+ calc;
	}

	public static void main(String[] args) {

//		try (java.io.BufferedWriter bw = new BufferedWriter(new FileWriter(
//				new File("e:\\lotto.csv"), true))) {
//			for (int j = 1;j < 23; j++) {
				URL url = null;
				try {
					url = new URL(
							"http://www.lottery.gov.cn/lottery/dlt/History.aspx?p="
									+ 1);
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
//						System.out.println(tdes.get(11).text()+"===========>"+j);
						System.out.println(tdes.get(11).text() + " "
								+ tdes.get(0).text() + " "
								+ trim(tdes.get(1).text()));
					}
				} catch (IOException e) {
					logger.info("连接网址出现异常:==" + e.getMessage());
				}
//				System.out.println("================="+j);
//			}
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
	}
}
