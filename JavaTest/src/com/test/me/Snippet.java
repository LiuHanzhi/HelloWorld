package com.test.me;

public class Snippet {
	public static void main(String[] args) {
		
//		System.out.println(Runtime.getRuntime().availableProcessors());
		String  url = "http://114.134.86.105/res/20140515/mis_40561%20[300].mp4";
		
		System.out.println(url.substring(url.lastIndexOf("/")));
		System.out.println(url.substring(1));
	}

	
	
}

