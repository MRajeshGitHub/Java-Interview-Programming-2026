package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program06_LongestString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Java", "Spring Boot", "Microservices", "Docker", "Kafka");

		String subString = names.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);

		System.out.println("LongestString is :" + subString);

		// smallest String

		Optional<String> smalString = names.stream().reduce((a, b) -> a.length() < b.length() ? a : b);
		System.out.println("Smallest Sub String in the list :" + smalString.orElse(null));

		// 5 Characters String in the list

		List<String> length = names.stream().filter(n -> n.length() > 5).toList();

		System.out.println(length);
	}
}
