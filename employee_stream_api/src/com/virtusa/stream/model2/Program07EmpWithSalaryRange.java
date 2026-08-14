package com.virtusa.stream.model2;

import java.util.Arrays;
import java.util.List;

public class Program07EmpWithSalaryRange {

	public static void main(String[] args) {

		// Find employees salary between ₹50,000 to ₹80,000 salary

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune"));

		int max = 80000;
		int min = 50000;

		employees.stream().filter(emp -> emp.getSalary() >= min && emp.getSalary() <= max).toList()
				.forEach(System.out::println);// return immutable list java 16

	}
}
