package com.virtusa.stream.model2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program06EmployeeNameEndWithN {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad"),

				new Employee(102, "Arun", "HR", 28, 45000, "Delhi"),

				new Employee(103, "Kiran", "IT", 35, 85000, "Hyderabad"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune"));

		// Find Employees Whose Name Ends With "n" Mutable list

		List<Employee> listEmp = employees.stream().filter(emp -> emp.getName().endsWith("n"))
				.collect(Collectors.toList());

		listEmp.forEach(System.out::println);

		// OUTPUT..
		// Employee [id=102, name=Arun, department=HR, age=28, salary=45000.0,
		// city=Delhi]
		// Employee [id=103, name=Kiran, department=IT, age=35, salary=85000.0,
		// city=Hyderabad]
		System.out.println("----------------------");

		// using java 16 immutable list

		List<Employee> list = employees.stream().filter(emp -> emp.getName().endsWith("n")).toList();

		list.forEach(System.out::println);

	}
}
