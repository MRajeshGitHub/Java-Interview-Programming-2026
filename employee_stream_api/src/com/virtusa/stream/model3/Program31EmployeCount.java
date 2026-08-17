package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program31EmployeCount {

	// Count Total Number of Employees

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		long count = employees.stream().count();

		System.out.println("Total Number of Employees: ");
		System.out.println(count);

		// It Department employee list

		long empCount = employees.stream().filter(e -> e.getDepartment().equals("IT")).count();

		System.out.println("IT Department Employee Count is : " + empCount);

		// Find Second Highest Salary

		Employee orElse = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
				.skip(1).findFirst().orElse(null);

		System.out.println(orElse);

		Employee high = employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
				.distinct().skip(1).findFirst().orElse(null);

		System.out.println(high);
	}

}
