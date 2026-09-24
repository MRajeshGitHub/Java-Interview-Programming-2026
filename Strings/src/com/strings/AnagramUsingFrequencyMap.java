package com.strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramUsingFrequencyMap {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		boolean result = isAnagram(str1, str2);

		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		System.out.println("Anagram : " + result);

	}

	public static boolean isAnagram(String s1, String s2) {

		if (s1 == null || s2 == null) {
			return false;
		}

		if (s1.length() != s2.length()) {

			return false;
		}

		Map<Character, Integer> f = new HashMap<>();

		for (char ch : s1.toCharArray()) {

			f.put(ch, f.getOrDefault(ch, 0) + 1);
		}

		for (char ch : s2.toCharArray()) {
			if (!f.containsKey(ch)) {
				return false;
			}

			f.put(ch, f.get(ch) - 1);
		}

		for (int count : f.values()) {

			if (count != 0) {
				return false;
			}
		}

		return true;
	}
}
