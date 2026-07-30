package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.virtusa.model.Employee;

public class Program08_FlatMapCollectors {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring", "Git")),

				new Employee(102, "Amit", Arrays.asList("Java", "Docker", "SQL")),

				new Employee(103, "Rahul", Arrays.asList("Kafka", "Spring", "Git"))

		);

		Set<String> collect = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toSet());

		System.out.println(collect);// [Java, Git, Docker, Kafka, Spring, SQL]

		// Alphabetically Sorted Unique Skills

		List<String> list = employees.stream().flatMap(e -> e.getSkills().stream()).sorted().distinct()
				.collect(Collectors.toList());

		System.out.println(list);
	}
}
