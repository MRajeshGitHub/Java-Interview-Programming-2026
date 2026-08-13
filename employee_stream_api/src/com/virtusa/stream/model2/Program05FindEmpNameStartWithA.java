package com.virtusa.stream.model2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program05FindEmpNameStartWithA {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi"),

				new Employee(103, "Ankit", "IT", 35, 85000, "Hyderabad"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune"));

		// Find Employees Whose Name Starts With "A"

		List<Employee> nameList = employees.stream().filter(emp -> emp.getName().startsWith("A"))
				.collect(Collectors.toList());// immutable list

		nameList.forEach(System.out::println);
		System.out.println("------------------------------------------------");

		// mutable list
		List<Employee> list = employees.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());

		list.forEach(System.out::println);
	}
}
