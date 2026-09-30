package com.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		String value = "abcabcbb";

		Set<Character> characters = new HashSet<>();

		int left = 0;
		int maxLength = 0;
		String longestSubstring = "";

		for (int right = 0; right < value.length(); right++) {

			char ch = value.charAt(right);

			while (characters.contains(ch)) {
				characters.remove(value.charAt(left));
				left++;
			}

			characters.add(ch);

			int currentLength = right - left + 1;

			if (currentLength > maxLength) {
				maxLength = currentLength;
				longestSubstring = value.substring(left, right + 1);
			}
		}

		System.out.println("String : " + value);
		System.out.println("Longest Substring : " + longestSubstring);
		System.out.println("Length : " + maxLength);
	}
}
