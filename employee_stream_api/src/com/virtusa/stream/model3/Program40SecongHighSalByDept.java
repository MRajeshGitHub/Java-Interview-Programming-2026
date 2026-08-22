package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program40SecongHighSalByDept {

	public static void main(String[] args) {

		// Find Second Highest Salary in Each Department

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Map<String, Optional<Employee>> secondHighSalByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
								.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst())));

		secondHighSalByDept.forEach((dept, val) -> {
			System.out.println(dept);
			System.out.println("-------");
			System.out.println(val);
		});
		System.out.println("-----------------------------------------------------");

		// 2nd approach

		Map<String, Double> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,

				Collectors.collectingAndThen(

						Collectors.mapping(Employee::getSalary, Collectors.toList()),

						salaries -> salaries.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
								.orElse(null))));

		result.forEach((department, salary) -> System.out.println(department + " -> " + salary));

	}
}
