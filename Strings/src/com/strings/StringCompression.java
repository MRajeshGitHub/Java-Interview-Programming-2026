package com.strings;

public class StringCompression {

	public static void main(String[] args) {

		String value = "aaabbccccd";

		StringBuilder compressed = new StringBuilder();

		int count = 1;

		for (int i = 0; i < value.length() - 1; i++) {

			if (value.charAt(i) == value.charAt(i + 1)) {
				count++;
			} else {
				compressed.append(value.charAt(i));
				compressed.append(count);
				count = 1;
			}

		}

		compressed.append(value.charAt(value.length() - 1));
		compressed.append(count);

		System.out.println("Original String : " + value);
		System.out.println("Compressed String : " + compressed);
	}
}
