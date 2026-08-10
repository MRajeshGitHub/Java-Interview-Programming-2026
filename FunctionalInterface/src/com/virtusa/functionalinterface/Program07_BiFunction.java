package com.virtusa.functionalinterface;

import java.util.function.BiFunction;

public class Program07_BiFunction {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(11, 12));//23

	}
}
