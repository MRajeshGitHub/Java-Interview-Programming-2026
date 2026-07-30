package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.virtusa.model.Employee;

public class Program05_MapVsFlatMap {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring")),

				new Employee(102, "Amit", Arrays.asList("SQL", "Docker")),

				new Employee(103, "Rahul", Arrays.asList("Kafka", "Git"))

		);

		// map
		System.out.println("Using Map()");
		List<List<String>> nlist = employees.stream().map(Employee::getSkills).collect(Collectors.toList());
		System.out.println(nlist);// [[Java, Spring], [SQL, Docker], [Kafka, Git]]

		System.out.println("-----------------------------------------");
		// Flatmap

		System.out.println("Using FlatMap()");
		List<String> list = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toList());

		System.out.println(list);// [Java, Spring, SQL, Docker, Kafka, Git]
	}

}
