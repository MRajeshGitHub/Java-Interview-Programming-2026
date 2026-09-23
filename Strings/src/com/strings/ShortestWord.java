package com.strings;

public class ShortestWord {

	public static void main(String[] args) {

		String sentence = "Spring Boot Microservices API";

		if (sentence == null || sentence.isBlank()) {

			System.out.println("No Words Found");
		} else {

			String[] words = sentence.split("\\s+");

			String shortWord = words[0];

			for (String word : words) {

				if (word.length() < shortWord.length()) {
					shortWord = word;
				}
			}

			System.out.println(shortWord);
			System.out.println(shortWord.length());
		}
	}
}
