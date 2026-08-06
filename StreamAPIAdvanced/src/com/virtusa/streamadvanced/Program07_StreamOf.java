package com.virtusa.streamadvanced;

import java.util.stream.Stream;

public class Program07_StreamOf {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 55, 65, 67);

		stream.forEach(System.out::println);
		System.out.println("====================");

		Stream<String> names = Stream.of("Rajesh", "Rahul", "Amit");

		names.forEach(System.out::println);

		System.out.println("====================");
		// Example-3 (Filter + Stream.of)
		Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50, 55, 65, 67);

		stream1.filter(s -> s > 20).forEach(System.out::println);

		System.out.println("====================");
		// Example-4 (Map + Stream.of)

		Stream<String> names1 = Stream.of("Rajesh", "Rahul", "Amit");
		names1.map(String::toUpperCase).forEach(System.out::println);

	}
}
