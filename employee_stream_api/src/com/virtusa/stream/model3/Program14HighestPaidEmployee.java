package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program14HighestPaidEmployee {

	public static void main(String[] args) {

		// Find the Highest Paid Employee

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		
				Employee maxSal = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
				

		System.out.println(maxSal);// Employee [id=103, name=Rahul, department=IT, age=35, salary=85000.0,
												// city=Hyderabad, gender=Male]

	}
}
