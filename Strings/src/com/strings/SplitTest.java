package com.strings;

public class SplitTest {

	public static void main(String[] args) {

		String value = "Java Spring Boot";

		String[] result = value.split(" ");

		for (String word : result) {
			System.out.println(word);
		}

		System.out.println("-----------------------");
		String value1 = "Java   Spring   Boot   Microservices";

		String[] split = value1.split("\\s+");
		
		System.out.println(split.length);

		for (String word : split) {
			System.out.println(word);
		}
	}
}
