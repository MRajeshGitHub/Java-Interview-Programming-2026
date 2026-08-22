package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program41DeptTopThreeEmployees {

	public static void main(String[] args) {

		// Department-wise Top 3 Employees

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "IT", 28, 65000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "IT", 32, 60000, "Mumbai", "Female"),

				new Employee(105, "Pooja", "HR", 30, 75000, "Delhi", "Female"),

				new Employee(106, "Priya", "HR", 29, 60000, "Pune", "Female"),

				new Employee(107, "Ravi", "HR", 34, 55000, "Delhi", "Male"),

				new Employee(108, "Karan", "HR", 31, 45000, "Mumbai", "Male"));

		Map<String, List<Employee>> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.toList(),
								emp -> emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
										.limit(3).collect(Collectors.toList()))));

		collect.forEach((dept, elist) -> {
			System.out.println(dept);
			System.out.println("------");
			elist.forEach(System.out::println);
		});
	}

}
