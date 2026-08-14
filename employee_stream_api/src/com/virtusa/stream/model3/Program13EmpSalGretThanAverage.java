package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program13EmpSalGretThanAverage {

	public static void main(String[] args) {

		// Employees Whose Salary Is Greater Than Average

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Double avg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		List<Employee> list = employees.stream().filter(emp -> emp.getSalary() > avg).toList();

		System.out.println(avg);
		list.forEach(System.out::println);
	}
}
