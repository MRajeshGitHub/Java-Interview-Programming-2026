package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program23SortEmployeesByAge {

	public static void main(String[] args) {

		// Sort Employees by Age low-high

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		List<Employee> ageList = employees.stream().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println("Employees Sorted By Age : ");

		ageList.forEach(System.out::println);
	}
}
