package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program02_ToSet {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Hyderabad", "Pune", "Hyderabad", "Bangalore", "Pune", "Chennai");

		// java 8 to java 21 for common element Collectors.toSet() only applied
		Set<String> uniqueCities = cities.stream().collect(Collectors.toSet());
		System.out.println("Original List : " + cities);
		System.out.println();
		System.out.println("Unique Set    : " + uniqueCities);

		// Names Uppercase Unique Set

		Set<String> uppercase = cities.stream().map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println("Unique UpperCase Set    : " + uppercase);
	}
}
