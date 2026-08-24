package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program44DuplicatEmployee {

	public static void main(String[] args) {

		
		//Find Duplicate Employees
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

		count.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e ->System.out.println("Duplicate ID is :"+e.getKey()));

	}

}
