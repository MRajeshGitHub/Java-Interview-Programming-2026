package com.strings;

public class ReverseWordOrder {

	public static void main(String[] args) {

		String sentance = "java is eassy";

		String[] words = sentance.split(" ");

		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {
			result = result + words[i] + " ";
		}

		System.out.println(sentance);
		System.out.println(result.trim());
	}
}
