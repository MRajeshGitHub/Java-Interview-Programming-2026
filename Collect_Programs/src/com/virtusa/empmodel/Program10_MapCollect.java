package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program10_MapCollect {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		List<String> collect = employees.stream().map(emp -> emp.getName() + "---" + emp.getSalary())
				.collect(Collectors.toList());
		System.out.println("Employee Details");
		collect.forEach(System.out::println);
	}
}
