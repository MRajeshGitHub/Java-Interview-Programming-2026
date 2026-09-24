package com.strings;

import java.util.Arrays;

public class AnagramUsingSorting {

	public static void main(String[] args) {

		String sr1 = "race";
		String sr2 = "care";

		boolean anagram = isAnagram(sr1, sr2);
		boolean anagram2 = isAnagram("ab", "ba");

		System.out.println(sr1);
		System.out.println(sr2);
		System.out.println(anagram);
		System.out.println(anagram2);

	}

	public static boolean isAnagram(String s1, String s2) {

		if (s1 == null || s2 == null) {
			return false;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

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
