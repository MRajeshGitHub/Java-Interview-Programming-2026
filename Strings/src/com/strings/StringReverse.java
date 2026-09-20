package com.strings;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Interview";

		// type 1
		String sb = new StringBuilder(s).reverse().toString();
		System.out.println(sb);

		// type 2

		char[] ch = s.toCharArray();

		// int i = 0, j = ch.length - 1;
		/*
		 * while (i < j) { char temp = ch[i]; ch[i] = ch[j]; ch[j] = temp; i++; j--;
		 * 
		 * }
		 */
		System.out.println(ch);

		// type 3

		char[] arr = s.toCharArray();
		String reverse = "";

		// i >= 0 करने से Index 0 ('I') भी कवर होगा
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse += arr[i];
		}
		System.out.println(reverse);

	}
}
