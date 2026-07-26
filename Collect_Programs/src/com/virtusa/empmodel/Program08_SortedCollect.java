package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program08_SortedCollect {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(40, 10, 60, 20, 50, 30);

		// Using java 8
		List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Original List : " + numbers);
		System.out.println("Sorted List   : " + list);

		// Using java 16
		System.out.println("Sorted using java 16");
		List<Integer> list2 = numbers.stream().sorted().toList();
		System.out.println("Original List : " + numbers);
		System.out.println("Sorted List   : " + list);

		// Disc Order

		List<Integer> list3 = numbers.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println("Desc Order");
		System.out.println(list3);

		// (String Sorting

		List<String> names = Arrays.asList("Sunil", "Rajesh", "Amit", "Neha");

		List<String> list4 = names.stream().sorted().toList();
		System.out.println("Names sorting ASC");
		System.out.println(list4);

		//// Disc Order
		List<String> list5 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Names sorting DISC");
		System.out.println(list5);

	}
}
