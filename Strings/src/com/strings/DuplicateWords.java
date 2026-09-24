package com.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {

		String sentance = "java spring boot java easy";

		String[] words = sentance.split("\\s+");

		Map<String, Integer> fr = new HashMap<>();

		for (String word : words) {

			fr.put(word, fr.getOrDefault(word, 0) + 1);
		}
		System.out.println(fr);

		System.out.println("Duplicate words list");
		System.out.println("--------------------");

		for (Map.Entry<String, Integer> entry : fr.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "----" + entry.getValue());
			}

		}
	}

}
