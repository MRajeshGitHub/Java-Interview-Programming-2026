package com.strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

	public static void main(String[] args) {

		String sentance = "java spring boot java spring boot is easy java .";

		String[] words = sentance.split("\\s+");

		Map<String, Integer> f = new HashMap<>();

		for (String word : words) {

			f.put(word, f.getOrDefault(word, 0) + 1);

		}

		System.out.println(f);

		System.out.println("Most frequent words ");
		String mostFrequentWord = "";
		int maxfrequency = 0;

		for (Map.Entry<String, Integer> entry : f.entrySet()) {

			if (entry.getValue() > maxfrequency) {
				maxfrequency = entry.getValue();
				mostFrequentWord = entry.getKey();
			}

		}

		System.out.println(maxfrequency);
		System.out.println(mostFrequentWord);

	}
}
