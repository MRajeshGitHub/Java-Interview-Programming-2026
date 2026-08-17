package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program29AverageEmpSal {

	public static void main(String[] args) {

		// Average Employee Salary

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Double salAvg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println(salAvg);// 63000.0

		// only average salary

		double avg = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
		System.out.println("only average salary");
		System.out.println(avg);
	}

}
