package com.strings;

public class ExtractSpecialCharacters {

	public static void main(String[] args) {

		String value = "Java@123#Dev!";

		StringBuilder sb = new StringBuilder();

		for (char ch : value.toCharArray()) {

			if (!Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			}
		}

		System.out.println(value);
		System.out.println(sb);
		

	}
}
