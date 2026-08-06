package com.virtusa.streamadvanced;

import java.util.Random;
import java.util.stream.Stream;

public class Program09_StreamGenerate {

	public static void main(String[] args) {

		Stream.generate(() -> "Java").limit(10).forEach(System.out::println);

		// Example-2 (Random Numbers)

		System.out.println("--------------------");
		Random r = new Random();
		Stream.generate(() -> r.nextInt(100)).limit(10).forEach(System.out::println);
	}
}
