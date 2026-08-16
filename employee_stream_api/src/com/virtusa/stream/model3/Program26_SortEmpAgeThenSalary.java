package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program26_SortEmpAgeThenSalary {

	public static void main(String[] args) {

		// Sort Employees by Age, Then by Salary

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"),

				new Employee(106, "Rohit", "IT", 28, 65000, "Delhi", "Male"));

		employees.forEach(System.out::println);
		System.out.println("---------------------------------------");

		List<Employee> list = employees.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());

		System.out.println("-------Sort Employees by Age, Then by Salary--------------");
		list.forEach(System.out::println);
		
		
	}
}
