package com.strings;

public class CheckOnlyDigits {

	public static void main(String[] args) {

		String value = "123456";

		boolean onlyDigits = true;

		for (char ch : value.toCharArray()) {

			if (!Character.isDigit(ch)) {
				onlyDigits = false;
				break;
			}
		}

		System.out.println("Value : " + value);
		System.out.println("Only Digits : " + onlyDigits);

	}
}
