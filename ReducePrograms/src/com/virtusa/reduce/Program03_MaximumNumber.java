package com.virtusa.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program03_MaximumNumber {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(25, 10, 45, 30, 80, 60, 67, 82, 93, 88, 99);

		Integer max = numbers.stream().reduce(0, Integer::max);
		System.out.println(max);

		// min value

		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
		System.out.println(min);

	}
}
