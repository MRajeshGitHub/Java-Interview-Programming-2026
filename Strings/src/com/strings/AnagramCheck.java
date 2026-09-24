package com.strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

		String sr = "java";

		String sr1 = "listen";

		boolean anagram = isAnagram(sr, sr1);

		System.out.println(sr);
		System.out.println(sr1);
		System.out.println("anagram  :" + anagram);

	}

	public static boolean isAnagram(String s1, String s2) {

		if (s1 == null || s2 == null) {
			return false;
		}

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		Arrays.equals(ch1, ch2);

		return true;

	}
}
