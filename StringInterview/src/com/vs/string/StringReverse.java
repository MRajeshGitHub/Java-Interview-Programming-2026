package com.vs.string;

public class StringReverse {

	public static void main(String[] args) {

		// using two pointers...

		String twoPointers = twoPointers("Rajesh");
		System.out.println(twoPointers);

	}

	public static String twoPointers(String str) {

		if (str == null) {
			return "";
		}

		char[] ch = str.toCharArray();

		int left = 0;
		int right = ch.length - 1;

		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);

	}
}
