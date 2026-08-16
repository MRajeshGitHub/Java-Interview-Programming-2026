package com.virtusa.stream.model4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program27SortEmpWithNullSalHandle {

	public static void main(String[] args) {

		// Sort Employees with Null Salary Handling

		List<Employee> employees = Arrays.asList(new Employee(101, "Rajesh", "IT", 40, 70000.0, "Hyderabad", "Male"),
				new Employee(102, "Amit", "HR", 28, null, "Delhi", "Male"),
				new Employee(103, "Rahul", "IT", 35, 85000.0, "Hyderabad", "Male"),
				new Employee(104, "Neha", "HR", 32, 55000.0, "Mumbai", "Female"),
				new Employee(105, "Priya", "Sales", 29, null, "Pune", "Female"));

		List<Employee> list = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary, Comparator.nullsLast(Comparator.naturalOrder())))
				.collect(Collectors.toList());
		list.forEach(System.out::println);

	}
}
