package com.virtusa.stream.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program01EmployeeSal {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 70000), new Employee(102, "Amit", "HR", 45000),
				new Employee(103, "Rahul", "IT", 85000), new Employee(104, "Neha", "HR", 55000),
				new Employee(105, "Vikas", "Sales", 40000));

		// Salary > 50,000

		List<Employee> empList = employees.stream().filter(emp -> emp.getSalary() > 50000).toList();// toList java 16
																									// features
		// System.out.println("Employee >50000 list is : " + empList);
		empList.forEach(System.out::println);

		// using collectors
		System.out.println("=============");

		List<Employee> list = employees.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());

		list.forEach(System.out::println);
	}
}
