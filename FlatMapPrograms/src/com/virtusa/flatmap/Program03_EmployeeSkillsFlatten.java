package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.virtusa.model.Employee;

public class Program03_EmployeeSkillsFlatten {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring")),

				new Employee(102, "Amit", Arrays.asList("SQL", "Docker")),

				new Employee(103, "Rahul", Arrays.asList("Kafka", "Git"))

		);
		// Using java 8
		List<String> list = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toList());

		System.out.println(list);
		// Using java 16
		List<String> skills = employees.stream().flatMap(emp -> emp.getSkills().stream()).toList();
		System.out.println(skills);// [Java, Spring, SQL, Docker, Kafka, Git]

	}

}
