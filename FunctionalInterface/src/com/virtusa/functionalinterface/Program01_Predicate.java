package com.virtusa.functionalinterface;

import java.util.function.Predicate;

public class Program01_Predicate {

	public static void main(String[] args) {

		Predicate<Integer> isEven = number -> number % 2 == 0;

		System.out.println(isEven.test(10));// true

		System.out.println(isEven.test(15));// false

		// Age validations

		Predicate<Integer> age = a -> a >= 18;
		System.out.println(age.test(33));// true
		System.out.println(age.test(12));// false

		// String Check

		Predicate<String> str = s -> s.equals("Java");
		System.out.println(str.test("java"));// false
		System.out.println(str.test("python"));// false
	}

}
