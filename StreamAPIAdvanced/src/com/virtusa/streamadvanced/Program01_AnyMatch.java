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

		// Program02_AllMatch

		boolean allMatch = numbers.stream().allMatch(n -> n > 9);

		System.out.println("All match is : " + allMatch);// All match is : true

		// Program03 - noneMatch()

		boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);

		System.out.println("Non Match : " + noneMatch);// Non Match : true

		boolean anyMatch3 = numbers.stream().anyMatch(n -> n % 2 == 1);
		System.out.println(anyMatch3);//false
	}
}
