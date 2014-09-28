package com.test.me;

public class ColorFormat {

	public static void main(String[] args) {
		String color = "fffffffe";
		System.out.println(((int)Long.parseLong(color,16)));
		System.out.println(Long.parseLong(color,16));
		
		
		System.out.println(0x80000001);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
