package com.virtusa.stream.model2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program04FindEmployeesByCity {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune"));

		// Find "Hyderabad" city employees form list

		// toList java 16 features
		List<Employee> cityList = employees.stream().filter(emp -> emp.getCity().equals("Hyderabad")).toList();

		cityList.forEach(System.out::println);

		// Using collectors
		System.out.println("----------------------------");

		List<Employee> hydList = employees.stream().filter(emp -> emp.getCity().equals("Hyderabad"))
				.collect(Collectors.toList());

		hydList.forEach(System.out::println);
	}

}
