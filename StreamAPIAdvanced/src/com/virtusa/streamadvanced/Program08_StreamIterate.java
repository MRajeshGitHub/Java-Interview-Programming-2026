package com.virtusa.streamadvanced;

import java.util.stream.Stream;

public class Program08_StreamIterate {

	public static void main(String[] args) {

		Stream.iterate(1, n -> n + 2).limit(16).forEach(System.out::println);
	}
}
