package com.test.me;

import java.text.DateFormat;
import java.util.Date;

public class TimeFormat {

	
	public static void main(String[] args) {
		System.out.println(time2String(1581215200));
		System.out.println((System.currentTimeMillis()));
		System.out.println(time2String(System.currentTimeMillis()+179429608));
		long preTime = 1581215200;
		System.out.println(preTime>System.currentTimeMillis()?true:false);
	}
	public static String time2String(long milSec){
		String time;
		Date date = new Date(milSec);
		time = DateFormat.getDateInstance().format(date);
		
		
		return time;
		
	}
}
