package com.strings;

public class Substring {

	public static void main(String[] args) {

		String value = "JavaDeveloperBoot";

		String resule = value.substring(4);

		String result = value.substring(0, 4);
		String result1= (String) value.subSequence(13,value.length());

		System.out.println(resule);
		System.out.println(result1);
	}
}
