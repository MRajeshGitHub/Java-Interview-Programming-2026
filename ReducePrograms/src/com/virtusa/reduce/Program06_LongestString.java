package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;

public class Program06_LongestString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Java", "Spring Boot", "Microservices", "Docker", "Kafka");

		String subString = names.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);

		System.out.println("LongestString is :" + subString);
	}
}
