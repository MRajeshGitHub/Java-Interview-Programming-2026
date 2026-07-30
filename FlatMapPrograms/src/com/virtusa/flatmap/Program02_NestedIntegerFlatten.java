package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program02_NestedIntegerFlatten {

	public static void main(String[] args) {

		List<List<Integer>> numbers = Arrays.asList(

				Arrays.asList(10, 20, 30),

				Arrays.asList(40, 50),

				Arrays.asList(60, 70, 80, 90)

		);

		// Using java 8
		List<Integer> list = numbers.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(list);
		// Using java 16
		List<Integer> list2 = numbers.stream().flatMap(List::stream).toList();
		System.out.println(list2);

		// Numbers-Sum

		int sum = numbers.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
		System.out.println("Sum is : " + sum);

		// Even-Num check

		List<Integer> even = numbers.stream().flatMap(List::stream).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(even);

		// sort int DESC with java 16 toList()

		List<Integer> list3 = numbers.stream().flatMap(List::stream).sorted((a,b)->b-a).toList();
		System.out.println(list3);
	}
}
