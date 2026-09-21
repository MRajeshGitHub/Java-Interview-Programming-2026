package com.strings;

public class StringEmptyCheck {

	public static void main(String[] args) {

		String str = " ";

		if (str == null || str.isBlank()) {

			System.out.println("String is blank");
		}

		else
			System.out.println("user name required");
	}
}
