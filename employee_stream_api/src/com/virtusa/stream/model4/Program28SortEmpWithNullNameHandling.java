package com.virtusa.stream.model4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program28SortEmpWithNullNameHandling {

	public static void main(String[] args) {

		// Sort Employees with Null Name Handling

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000.0, "Hyderabad", "Male"),

				new Employee(102, null, "HR", 28, 45000.0, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000.0, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000.0, "Mumbai", "Female"),

				new Employee(105, null, "Sales", 29, 60000.0, "Pune", "Female"));

		List<Employee> list = employees.stream()
				.sorted(Comparator.comparing(Employee::getName, Comparator.nullsLast(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		System.out.println("=========Sort Employees with Null Name Handling=====================");
		list.forEach(System.out::println);
	}
}
