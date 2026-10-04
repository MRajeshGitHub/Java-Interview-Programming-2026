package com.vs.string;

public class StringReverseTest {

	public static void main(String[] args) {

		String reverseString = reverseString("ajay");
		System.out.println(reverseString);
	}

	public static String reverseString(String str) {

		if (str == null) {
			return " ";
		}

		char[] ch = str.toCharArray();

		char[] result = new char[ch.length];
		int j = 0;

		for (int i = ch.length - 1; i >= 0; i--) {

			result[j] = ch[i];
			j++;

		}

		return new String(result);
	}
}
