package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program15lowestPaidEmployee {

	public static void main(String[] args) {

		// Find the Lowest Paid Employee

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Employee loSal = employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(loSal);//Employee [id=102, name=Amit, department=HR, age=28, salary=45000.0, city=Delhi, gender=Male]

	}
}
