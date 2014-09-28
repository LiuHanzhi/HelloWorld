package com.test.me;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDecimalFormat {

	public static void main(String[] args) {
		getMb(1);
		System.out.println(getMB_Decimal(1024*1000));
//		for (long i = 1024; i < 1024*1024; i++) {
//		}
	}
	
	public static void getMb(long size){
		double val = size / (1024 * 1024.0);
		BigDecimal bd = new BigDecimal(val);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		 System.out.println(bd.toString() + "");
	}
	public static String getMB_Decimal(long size) {

		double md = size / (1024 * 1024.0);

		try{
			DecimalFormat decimalFormat = new DecimalFormat(".0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
			String ss = decimalFormat.format(md) ;
			
			System.out.println("ss:"+ss);
			String mS = new Double(ss).toString();
			System.out.println("mS:"+mS);
			
			int start = mS.lastIndexOf(".");

			if (start > 0) {

				int len = mS.substring(start + 1).length();

				if (len == 1) {

					return mS + "0MB";
				}

				return mS + "MB";
			}

			return mS + ".0MB";
		} catch (Exception e){
			
			return md + "MB" ;
			
		}
	}
}
