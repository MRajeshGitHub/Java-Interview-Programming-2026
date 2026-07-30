package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;

import com.virtusa.model.Employee;

public class Program07_FlatMapFilter {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring", "Git")),

				new Employee(102, "Amit", Arrays.asList("SQL", "Docker", "Java")),

				new Employee(103, "Rahul", Arrays.asList("Kafka", "Spring", "AWS"))

		);

		List<String> list = employees.stream().flatMap(e -> e.getSkills().stream()).filter(e -> e.startsWith("J"))
				.toList();
		System.out.println(list);

	}
}
