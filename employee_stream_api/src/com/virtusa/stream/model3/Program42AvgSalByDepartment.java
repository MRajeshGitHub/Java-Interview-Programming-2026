package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program42AvgSalByDepartment {

	public static void main(String[] args) {

		// Department with Highest Average Salary

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(103, "Amit", "IT", 28, 65000, "Delhi", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Pooja", "HR", 30, 45000, "Delhi", "Female"),

				new Employee(106, "Ravi", "HR", 34, 60000, "Delhi", "Male"),

				new Employee(107, "Priya", "Sales", 29, 50000, "Pune", "Female"),

				new Employee(108, "Karan", "Sales", 31, 60000, "Pune", "Male"));

		Map<String, Double> avgDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		avgDept.forEach((dept, sal) -> {
			System.out.println(dept);
			System.out.println("-----------");
			System.out.println(sal);
		});
	}
}
