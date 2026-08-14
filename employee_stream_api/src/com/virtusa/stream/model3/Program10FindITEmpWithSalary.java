package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;

public class Program10FindITEmpWithSalary {

	public static void main(String[] args) {

		// Find IT Employees with Salary > ₹70,000

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "IT", 29, 60000, "Pune", "Female"));

		String dept = "IT";
		List<Employee> list = employees.stream()
				.filter(emp -> dept.equals(emp.getDepartment()) && emp.getSalary() >= 70000).toList();

		list.forEach(System.out::println);
	}

}
