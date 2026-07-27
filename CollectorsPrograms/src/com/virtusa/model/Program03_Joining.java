package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program03_Joining {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rajesh", "Amit", "Sunil", "Neha");

		String joinNames = names.stream().collect(Collectors.joining());
		System.out.println(joinNames);// RajeshAmitSunilNeha
		String joinNames1 = names.stream().collect(Collectors.joining(", "));
		System.out.println(joinNames1);// Rajesh, Amit, Sunil, Neha

		String joinNames2 = names.stream().collect(Collectors.joining("   "));
		System.out.println(joinNames2);// Rajesh Amit Sunil Neha

		// Prefix and Suffix
		String joinNames3 = names.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(joinNames3);// [Rajesh, Amit, Sunil, Neha]

		// Uppercase Names Join

		String upperName = names.stream().map(String::toUpperCase).collect(Collectors.joining(", ", "[", "]"));
		System.out.println(upperName);// [RAJESH, AMIT, SUNIL, NEHA]

	}
}
