package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program07_StringConcatenation {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java", "Spring", "Boot", "Docker");

		String concat = words.stream().reduce("", String::concat);

		System.out.println(concat);

	}
}
