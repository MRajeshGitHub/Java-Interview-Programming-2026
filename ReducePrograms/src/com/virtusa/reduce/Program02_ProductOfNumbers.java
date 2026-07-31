package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;

public class Program02_ProductOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

		Integer product = numbers.stream().reduce(1, (a, b) -> a * b);

		System.out.println("Product using reduce : " + product);
	}

}
