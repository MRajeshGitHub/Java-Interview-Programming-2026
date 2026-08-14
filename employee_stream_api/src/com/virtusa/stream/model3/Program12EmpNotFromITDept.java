package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;

public class Program12EmpNotFromITDept {

	public static void main(String[] args) {

		// Find Employees Who Are NOT From IT Department

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		String dept = "IT";
		List<Employee> list = employees.stream().filter(emp -> !dept.equals(emp.getDepartment())).toList();

		list.forEach(System.out::println);
	}
}
