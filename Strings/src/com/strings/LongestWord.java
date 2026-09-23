package com.strings;

public class LongestWord {

	public static void main(String[] args) {

		String sentance = "java spring boot developer in hyderabad";

		if (sentance == null || sentance.isBlank()) {

			System.out.println("no word found");
		}

		else {

			String[] split = sentance.split("\\s+");

			String longest = "";

			for (String word : split) {

				if (word.length() > longest.length()) {
					longest = word;
				}
			}

			System.out.println(sentance);

			System.out.println(longest);

			System.out.println(longest.length());
		}
	}
}
