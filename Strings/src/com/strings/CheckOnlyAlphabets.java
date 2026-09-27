package com.strings;

public class CheckOnlyAlphabets {

	public static void main(String[] args) {

		String name = "java";

		boolean checkAlphabet = checkAlphabet(name);

		System.out.println(name);
		System.out.println(checkAlphabet);

	}

	public static boolean checkAlphabet(String value) {

		if (value == null || value.isEmpty()) {
			return false;
		}

		for (char ch : value.toCharArray()) {

			if (!Character.isLetter(ch)) {
				return false;
			}
		}

		return true;
	}
}
