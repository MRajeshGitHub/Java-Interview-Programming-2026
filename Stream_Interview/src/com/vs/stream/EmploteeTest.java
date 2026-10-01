package com.vs.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmploteeTest {

	public static void main(String[] args) {

		List<Employee> employees = List.of(new Employee(1, "Arun", 32, "IT", "Delhi", 75000.0, "Male"),
				new Employee(2, "Anita", 28, "HR", "Mumbai", 45000.0, "Female"),
				new Employee(3, "Rohan", 30, "IT", "Hyderabad", 30000.0, "Male"), // age = 30 and salary = 30000
																					// (boundary)
				new Employee(4, "Priya", 35, "Finance", "Delhi", 80000.0, "Female"), // salary = 80000 (boundary)
				new Employee(5, "Kiran", 41, "IT", "Delhi", 95000.0, "Male"), // Ends with name "n"
				new Employee(6, "Sneha", 26, "HR", "Bangalore", 28000.0, "Female"), // out of range
				new Employee(7, "Amit", 38, "Finance", "Mumbai", 62000.0, "Male"),
				new Employee(8, "Divya", 30, "IT", "Hyderabad", 55000.0, "Female"),
				new Employee(9, "Vikram", 45, "Sales", "Delhi", 120000.0, "Male"),
				new Employee(10, "aman", 29, "Sales", "Pune", 33000.0, "Male"), // small "a" (trap) and ends with "n"
				new Employee(11, "Meena", 33, "Sales", "Chennai", 50000.0, "Female"),
				new Employee(12, "Naveen", 31, "IT", "Bangalore", 82000.0, "Male") // salary range, Ends with "n"
		);
		System.out.println("-----------------------------------------------------------------------");

		// Program 1 — Age > 30

		List<Employee> list = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
		list.forEach(System.out::println);

	}
}
