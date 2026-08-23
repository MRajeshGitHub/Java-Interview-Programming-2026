package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Program43DeptMaximumEmployees {

	public static void main(String[] args) {

		// Department with Maximum Employees

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(103, "Amit", "IT", 28, 65000, "Delhi", "Male"),

				new Employee(104, "Neha", "IT", 32, 60000, "Mumbai", "Female"),

				new Employee(105, "Pooja", "HR", 30, 55000, "Delhi", "Female"),

				new Employee(106, "Ravi", "HR", 34, 60000, "Delhi", "Male"),

				new Employee(107, "Karan", "HR", 31, 45000, "Mumbai", "Male"),

				new Employee(108, "Priya", "Sales", 29, 50000, "Pune", "Female"),

				new Employee(109, "Anil", "Sales", 33, 60000, "Pune", "Male"));

		Map<String, Long> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		collect.forEach((dept, count) -> {
			System.out.println("Department : " + dept + "---EmployeeCount : " + count);
		});

		System.out.println("-----------------------------");
		// max Employee by department

		Entry<String, Long> maxDept = collect.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
				.orElse(null);

		System.out.println("Department : " + maxDept.getKey());// Department : IT
		System.out.println("Employee Count : " + maxDept.getValue());// Employee Count : 4

	}
}
