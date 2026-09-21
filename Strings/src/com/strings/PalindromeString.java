package com.strings;

public class PalindromeString {

	public static void main(String[] args) {

		String name = "madam";

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		if (rev.equals(name)) {
			System.out.println("name is Palindrom");
		}
	}
}
