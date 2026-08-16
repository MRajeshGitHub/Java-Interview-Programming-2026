package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program22EmployeeSortBySalary {

	public static void main(String[] args) {

		// salary ascending order (Low → High)

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());

		list.forEach(System.out::println);

		System.out.println("-----------------");
		// only Salary low to high without employee details

		List<Double> list2 = employees.stream().map(Employee::getSalary).sorted().toList();

		list2.forEach(System.out::println);
	}
}
