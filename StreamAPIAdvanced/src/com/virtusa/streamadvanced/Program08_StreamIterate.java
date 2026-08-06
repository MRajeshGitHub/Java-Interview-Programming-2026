package com.virtusa.streamadvanced;

import java.util.List;
import java.util.stream.Stream;

public class Program08_StreamIterate {

	public static void main(String[] args) {

		Stream.iterate(1, n -> n + 2).limit(16).forEach(System.out::println);

		// even numbers

		List<Integer> list = Stream.iterate(2, n -> n + 2).limit(10).toList();

		System.out.println(list);

		// Example-4 (Squares)

		List<Integer> list2 = Stream.iterate(1, n -> n + 1).limit(5).map(n -> n * n).toList();

		System.out.println(list2);
	}
}
