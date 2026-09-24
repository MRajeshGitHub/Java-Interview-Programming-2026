package com.strings;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {

		String sentance = "Java spring and spring boot both is Java fremwork Java";

		String[] word = sentance.split("\\s+");

		Map<String, Integer> frqu = new HashMap<>();

		for (String words : word) {

			frqu.put(words, frqu.getOrDefault(words, 0) + 1);

		}

		System.out.println(frqu);
	}
}
