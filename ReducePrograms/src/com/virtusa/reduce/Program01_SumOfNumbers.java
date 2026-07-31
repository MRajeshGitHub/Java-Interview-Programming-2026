package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;

public class Program01_SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Reduce Sum : "+sum);
	}
}
