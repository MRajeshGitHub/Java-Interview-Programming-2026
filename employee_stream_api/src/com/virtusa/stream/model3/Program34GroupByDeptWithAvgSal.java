package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program34GroupByDeptWithAvgSal {

	public static void main(String[] args) {

		// Calculate Average Salary by Department

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Map<String, Double> detpSal = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("-----Average Salary by Department-------");
		detpSal.forEach((dept, sal) -> {
			System.out.println(dept + "------>" + sal);

		});
	}

}
