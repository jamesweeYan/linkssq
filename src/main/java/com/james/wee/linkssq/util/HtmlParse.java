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

	//
	public static String parseOpenSSQData() {
		String openData = null;
//		try {

			URL url = null;
			try {
				url = new URL(
						"http://kaijiang.zhcw.com/zhcw/inc/ssq/ssq_wqhg.jsp?pageNum=1");
			} catch (MalformedURLException e) {
				logger.info("url出现异常:=="+e.getMessage());
			}
			Document doc = null;
			try {
				doc = Jsoup.parse(url, 60000);
			} catch (IOException e) {
				logger.info("连接网址出现异常:=="+e.getMessage());
				try {
					doc = Jsoup.parse(url, 60000);
				} catch (IOException e1) {
					
					logger.info("再连接网址出现异常:=="+e.getMessage());
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

//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return openData;

	}

	public static void main(String[] args) {
		try {
			new HtmlParse().parseOpenSSQData();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
