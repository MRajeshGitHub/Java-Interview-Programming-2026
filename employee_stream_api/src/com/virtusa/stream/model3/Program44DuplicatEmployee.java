package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program44DuplicatEmployee {

	public static void main(String[] args) {

		// Find Duplicate Employees
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				// Duplicate ID
				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				// Duplicate ID
				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"));

		Map<Integer, Long> count = employees.stream()
				.collect(Collectors.groupingBy(Employee::getId, Collectors.counting()));

		count.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println("Duplicate ID is :" + e.getKey()));

		// 2nd Approach
		System.out.println("===========================");
		employees.sort(Comparator.comparing(Employee::getId));
		System.out.println("Dulicate Employee :");
		for (int i = 0; i < employees.size() - 1; i++) {
			if (employees.get(i).getId() == employees.get(i + 1).getId()) {
				System.out.println(employees.get(i));
			}
		}

		// Using HastSet

		Set<Employee> unique = new HashSet<>();
		System.out.println("Duplicate Employees is :");
		for (Employee emp : employees) {
			if (!unique.add(emp)) {
				System.out.println(emp);
			}
		}

	}

}
