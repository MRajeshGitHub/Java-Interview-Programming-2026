package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstPositionOfEachCharacter {

	public static void main(String[] args) {

		String value = "programming";

		Map<Character, Integer> f = new HashMap<>();

		for (int i = 0; i < value.length(); i++) {

			char ch = value.charAt(i);

			if (!f.containsKey(f)) {

				f.put(ch, i);
			}
		}

		System.out.println(value);
		System.out.println(f);
	}
}
