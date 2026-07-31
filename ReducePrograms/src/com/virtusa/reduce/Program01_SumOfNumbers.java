package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;

public class Program01_SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 75, 85);

		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Reduce Sum : " + sum);

		// Sum of Even Numbers

		Integer evenSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
		System.out.println("Reduce even sum is : " + evenSum);

		// Sum of Odd Numbers

		Integer oddSum = numbers.stream().filter(n -> n % 2 == 1).reduce(0, Integer::sum);

		System.out.println("Odd sum is : " + oddSum);// Odd sum is : 160
	}
}
