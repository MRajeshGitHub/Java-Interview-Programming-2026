package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program25SortEmpSalAndName {

	public static void main(String[] args) {

		// Sort Employees by Salary, Then by Name

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 70000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 45000, "Pune", "Female"));

		List<Employee> list = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println(" Sort Employees by Salary, Then by Name :");
		list.forEach(System.out::println);
	}

}
