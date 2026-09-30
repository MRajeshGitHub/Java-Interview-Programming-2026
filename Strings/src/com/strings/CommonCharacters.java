package com.strings;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {

	public static void main(String[] args) {

		String str1 = "programming";
		String str2 = "gaming";

		Set<Character> characters = new HashSet<>();

		for (char ch : str1.toCharArray()) {

			characters.add(ch);
		}

		Set<Character> commonCharacters = new HashSet<>();

		for (char ch : str2.toCharArray()) {

			if (characters.contains(ch)) {
				commonCharacters.add(ch);
			}

		}

		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		System.out.println("Common Characters : " + commonCharacters);
	}
}
