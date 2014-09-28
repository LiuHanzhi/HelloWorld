package com.test.me;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {

	public static void main(String[] args) {

		
		System.err.println(toMd5("http://www.hainavideo.com/video.php?group=20140421&filename=mis_800_59903.mp4"));
		System.err.println(toMd5("http://www.hainavideo.com/video.php?group=20140421&filename=mis_800_59903.mp4&download=1"));
	}

	public static String toMd5(String md5Str) {
		String result = "";
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(md5Str.getBytes("utf-8"));
			result = toHexString(algorithm.digest());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static String toHexString(byte[] bytes) {
		StringBuilder hexString = new StringBuilder();

		for (int b : bytes) {
			if (b < 0)
				b += 256;
			if (b < 16)
				hexString.append("0");
			hexString.append(Integer.toHexString(b));
		}
		return hexString.toString();
	}

}
