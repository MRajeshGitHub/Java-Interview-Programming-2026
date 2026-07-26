package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program09_FilterCollect {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);
		// Using java 8
		System.out.println("Using java 8");
		List<Employee> collect = employees.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());

		collect.forEach(System.out::println);

		// Using java 16
		System.out.println("Using java 16");
		List<Employee> list = employees.stream().filter(e -> e.getSalary() > 50000).toList();
		list.forEach(System.out::println);

		// Emps name whose salary more than 60k

		List<String> list2 = employees.stream().filter(e -> e.getSalary() >= 60000).map(Employee::getName).toList();

		System.out.println("Emp whos sal more than 60k :");
		System.out.println(list2);// [Amit, Neha]

	}
}
