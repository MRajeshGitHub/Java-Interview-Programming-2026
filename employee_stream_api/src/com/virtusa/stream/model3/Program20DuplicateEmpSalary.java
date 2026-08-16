package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Program20DuplicateEmpSalary {

	public static void main(String[] args) {

		// Find Employees With Duplicate Salaries

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 70000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 45000, "Pune", "Female"));

		Set<Double> duplicateSalaries = employees.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(duplicateSalaries);

		List<Employee> result = employees.stream().filter(e -> duplicateSalaries.contains(e.getSalary()))
				.collect(Collectors.toList());

		System.out.println("Employees With Duplicate Salaries:");

		result.forEach(System.out::println);

	}
}
