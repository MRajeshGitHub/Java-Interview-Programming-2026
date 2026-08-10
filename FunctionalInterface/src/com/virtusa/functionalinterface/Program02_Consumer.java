package com.virtusa.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program02_Consumer {

	public static void main(String[] args) {

		Consumer<String> printName = name -> System.out.println("Hello " + name);

		printName.accept("Rajesh");// Hello Rajesh

		// Print Square

		Consumer<Integer> squar = a -> System.out.println(a * a);

		squar.accept(9);// 81

		// Uppercase String

		Consumer<String> upper = u -> System.out.println(u.toUpperCase());
		upper.accept("rajesh");// RAJESH

		// forEach() + Consumer

		List<String> names = Arrays.asList("Rajesh", "Rahul", "Amit");

		names.forEach(n -> System.out.println(n));
	}
}
