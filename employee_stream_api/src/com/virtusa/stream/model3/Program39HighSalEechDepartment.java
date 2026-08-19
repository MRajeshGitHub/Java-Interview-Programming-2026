package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program39HighSalEechDepartment {

	public static void main(String[] args) {

		// Find Highest Paid Employee in Each

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		collect.forEach((dept, eList) -> {
			System.out.println(dept + "------" + eList.orElse(null));

		});
	}

}
