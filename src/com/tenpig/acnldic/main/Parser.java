package com.tenpig.acnldic.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	static final String resPath = "resources/";

	public void run() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(resPath + "dic.txt"));
		String s = null;
		String[] buf = null;
		Pattern p = Pattern.compile("<.*?>");
		int c = 0;
		while ((s = br.readLine()) != null) {
			if (s.contains("<!-- -->")) {
				System.out.println("----------------------");
				c++;

			}
			System.out.println(s.replaceAll("<.*?>", ""));
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
