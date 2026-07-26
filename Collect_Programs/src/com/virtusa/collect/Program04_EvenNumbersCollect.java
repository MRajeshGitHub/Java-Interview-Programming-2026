package com.virtusa.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program04_EvenNumbersCollect {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);

		List<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even no. from list :" + collect);// Even no. from list :[10, 20, 30, 40, 50]

		// Using java 16

		List<Integer> list = numbers.stream().filter(n -> n % 2 == 0).toList();
		System.out.println("Using java 16 even no list" + list);// Using java 16 even no list[10, 20, 30, 40, 50]
	}
}
