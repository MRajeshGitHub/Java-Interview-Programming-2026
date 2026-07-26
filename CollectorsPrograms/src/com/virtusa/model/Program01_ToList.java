package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program01_ToList {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rajesh", "Amit", "Sunil", "Neha");

		// Using java 8
		List<String> result = names.stream().collect(Collectors.toList());
		System.out.println("Original List : " + names);// Original List : [Rajesh, Amit, Sunil, Neha]
		System.out.println("Collected List: " + result);// Collected List: [Rajesh, Amit, Sunil, Neha]

		result.add("ajay");
		System.out.println(result);// Add element in collect possible

		// Using java 16

		List<String> list = names.stream().toList();
		System.out.println(list);// Add element not possible in toList()java 16 UnsupportedOperationException

	}
}
