package com.strings;

public class Test1 {

	public static void main(String[] args) {

		String str = "Varanasi";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println("-----------");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("-----------");
		char[] chh = str.toCharArray();

		int count = 0;
		for (int i = 0; i < chh.length; i++) {

			if (chh[i] == 'a') {
				count++;
			}
		}

		System.out.println(count);
	}
}
