package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.virtusa.model.Employee;

public class Program04_DistinctSkills {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring", "Git")),

				new Employee(102, "Amit", Arrays.asList("Java", "SQL", "Docker")),

				new Employee(103, "Rahul", Arrays.asList("Spring", "Kafka", "Git"))

		);

		// Using Java 16
		List<String> dSkills = employees.stream().flatMap(e -> e.getSkills().stream()).distinct().toList();
		System.out.println(dSkills);// [Java, Spring, Git, SQL, Docker, Kafka]

		// Using java 8 and setList

		Set<String> sSkills = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toSet());

		System.out.println(sSkills);// [Java, Git, Docker, Kafka, Spring, SQL] order not maintained with set type

		// alphabetical order

		List<String> sort = employees.stream().flatMap(e -> e.getSkills().stream()).distinct().sorted().toList();
		System.out.println(sort);
	}

}
