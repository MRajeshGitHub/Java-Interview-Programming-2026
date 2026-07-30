package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program01_FlatMapBasics {

	public static void main(String[] args) {
		List<List<String>> courses = Arrays.asList(

				Arrays.asList("Java", "Spring"),

				Arrays.asList("SQL", "Docker"),

				Arrays.asList("Git", "Kafka")

		);

		List<String> nameList = courses.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(nameList);// [Java, Spring, SQL, Docker, Git, Kafka]

	}
}
