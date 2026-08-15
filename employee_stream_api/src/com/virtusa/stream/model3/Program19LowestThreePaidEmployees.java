package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program19LowestThreePaidEmployees {

	public static void main(String[] args) {
		// Program 19 — Find Lowest 3 Paid Employees

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		// Using java 16 toList()
		List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).toList();

		list.forEach(System.out::println);
		System.out.println("-------------------------------");

		// Using java 8 collect(Collectors.toList())
		List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3)
				.collect(Collectors.toList());

		collect.forEach(System.out::println);

		// Only lowest salary

		List<Double> list2 = employees.stream().map(Employee::getSalary).distinct().sorted().limit(3).toList();

		System.out.println(list2);
	}
}
