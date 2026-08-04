package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;

public class Program09_ParallelReduce {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

		Integer parallelStream = numbers.parallelStream().reduce(0, Integer::sum);

		System.out.println("Total = : " + parallelStream);
	}
}
