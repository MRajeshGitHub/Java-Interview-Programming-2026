package com.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String value = "programming";

		Set<Character> chatacter = new HashSet<>();

		StringBuilder result = new StringBuilder();

		for (char ch : value.toCharArray()) {

			if (!chatacter.contains(ch)) {
				chatacter.add(ch);
				result.append(ch);
			}
		}

		System.out.println(value);
		System.out.println(chatacter);

	}
}
