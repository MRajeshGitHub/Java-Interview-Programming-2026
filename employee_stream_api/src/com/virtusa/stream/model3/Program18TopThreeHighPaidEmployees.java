package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program18TopThreeHighPaidEmployees {

	public static void main(String[] args) {

		// Find Top 3 Highest Paid Employees

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));
		List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
				.toList();

		System.out.println("Top 3 Highest Paid Employees:");
		list.forEach(System.out::println);
	}
}
