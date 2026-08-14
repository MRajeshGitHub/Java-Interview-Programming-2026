package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;

public class Program08FindMaleEmployee {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune", "Male"));

		String gender = "Male";

		employees.stream().filter(emp -> emp.getGender().equals(gender)).toList().forEach(System.out::println);
	}
}
