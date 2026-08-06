package com.virtusa.streamadvanced;

import java.util.stream.Stream;

public class Program09_StreamGenerate {

	public static void main(String[] args) {

		Stream.generate(() -> "Java").limit(10).forEach(System.out::println);
	}
}
