package com.strings;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {

	public static void main(String[] args) {

		String value = "banana";

		// Step 1: Character Frequency
		Map<Character, Integer> frequency = new HashMap<>();

		for (char ch : value.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Find maximum frequency
		int maxFrequency = 0;

		for (int count : frequency.values()) {
			if (count > maxFrequency) {
				maxFrequency = count;
			}
		}

		// Step 3: Find second maximum frequency
		int secondMaxFrequency = 0;

		for (int count : frequency.values()) {
			if (count < maxFrequency && count > secondMaxFrequency) {

				secondMaxFrequency = count;
			}
		}

		// Step 4: Find character having second maximum frequency
		Character secondMostFrequent = null;

		for (char ch : value.toCharArray()) {

			if (frequency.get(ch) == secondMaxFrequency) {
				secondMostFrequent = ch;
				break;
			}
		}

		System.out.println("String : " + value);
		System.out.println("Second Most Frequent Character : " + secondMostFrequent);
		System.out.println("Frequency : " + secondMaxFrequency);
	}
}
