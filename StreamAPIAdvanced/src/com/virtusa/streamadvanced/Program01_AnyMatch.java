package com.virtusa.streamadvanced;

import java.util.Arrays;
import java.util.List;

public class Program01_AnyMatch {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

		boolean anyMatch = numbers.stream().anyMatch(n -> n > 30);

		System.out.println(anyMatch);// true

		List<String> names = Arrays.asList("Rajesh", "Amit", "Rahul");

		boolean anyMatch2 = names.stream().anyMatch(n -> n.startsWith("R"));

		System.out.println(anyMatch2);// true
	}
}
