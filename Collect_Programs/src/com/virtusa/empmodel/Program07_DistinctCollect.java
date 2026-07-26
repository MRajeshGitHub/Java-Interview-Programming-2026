package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program07_DistinctCollect {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Hyderabad", "Pune", "Hyderabad", "Bangalore", "Pune", "Chennai");

		// Using java 8

		List<String> collect = cities.stream().distinct().collect(Collectors.toList());

		System.out.println("Original List : " + cities);
		System.out.println("Unique List   : " + collect);

		System.out.println("--------------------------");
		// Using java 16
		List<String> list = cities.stream().distinct().toList();
		System.out.println("Original List : " + cities);
		System.out.println("Unique List   : " + list);

		// Unique and Uppercase with java 8

		List<String> collect2 = cities.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase + Distinct");
		System.out.println(collect2);

		// Unique and Uppercase with java 16

		List<String> collect3 = cities.stream().distinct().map(String::toUpperCase).toList();
		System.out.println("Uppercase + Distinct");
		System.out.println(collect3);

	}
}
