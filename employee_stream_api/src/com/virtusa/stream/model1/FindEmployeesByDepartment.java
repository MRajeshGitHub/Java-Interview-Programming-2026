package com.virtusa.stream.model1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmployeesByDepartment {

	public static void main(String[] args) {

		// Find Employees by Department

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000), new Employee(102, "Amit", "HR", 28, 45000),
				new Employee(103, "Rahul", "IT", 35, 85000), new Employee(104, "Neha", "HR", 32, 55000),
				new Employee(105, "Vikas", "Sales", 25, 40000));

		Map<String, List<Employee>> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		// System.out.println(collect);
		collect.forEach((dept, name) -> {
			System.out.println("Depatrment : " + dept);
			System.out.println("----------");
			System.out.println("name : " + name);
			System.out.println("----------");
		});

	}
}
