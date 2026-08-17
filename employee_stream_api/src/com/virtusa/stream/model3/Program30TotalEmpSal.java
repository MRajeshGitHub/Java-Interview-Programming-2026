package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;

public class Program30TotalEmpSal {

	public static void main(String[] args) {

		// Calculate Total Salary of All Employees

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		double total = employees.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total salary is : " + total);
	}
}
