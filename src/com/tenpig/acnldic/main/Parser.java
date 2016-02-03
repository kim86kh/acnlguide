package com.tenpig.acnldic.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	static final String resPath = "resources/";

	public String getBetween(String b, String e, String s) {
		return s.substring(s.indexOf(b) + b.length(), s.indexOf(e, s.indexOf(b) + b.length()));
	}

	public void run() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(resPath + "dic.txt"));
		String s = null;
		String[] buf = null;
		Pattern p = Pattern.compile("<.*?>");
		String ptnNameBegin = "<span class=\"catch-name\">";
		String ptnNameEnd = "</span>";

		int c = 0;
		while ((s = br.readLine()) != null) {
			if (s.contains("<!-- -->")) {
				System.out.println("----------------------");
				

			}
			if (s.contains(ptnNameBegin)) {
			//	System.out.println(getBetween(ptnNameBegin, ptnNameEnd, s));
				c++;
			}
			
			s=s.replaceAll("<.*?>", "").trim();
			if(s.length()==0) continue;
			
			 System.out.println(s);
			Matcher m = p.matcher(s);

		}
		System.out.println(c);
		br.close();
	}

	public static void main(String[] args) {
		Parser p = new Parser();
		try {
			p.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
