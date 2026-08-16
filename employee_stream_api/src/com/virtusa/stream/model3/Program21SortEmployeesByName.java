package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program21SortEmployeesByName {

	public static void main(String[] args) {

		// Sort Employees by Name

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println("Employees Sorted By Name:");

		list.forEach(System.out::println);

		System.out.println("----------------------------");
		// Name descending — Z → A

		List<Employee> list2 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		list2.forEach(System.out::println);

		System.out.println("----------------------------");
		// Only name sorting without any employee details

		List<String> list3 = employees.stream().map(Employee::getName).sorted().collect(Collectors.toList());
		list3.forEach(System.out::println);
	}
}
