package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program08FindMaleEmployee {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Vikas", "Sales", 25, 40000, "Pune", "Male"));

		String gender = "Female";

		employees.stream().filter(emp -> emp.getGender().equals(gender)).toList().forEach(System.out::println);

		System.out.println("----------------------");
		// checking Null safety

		employees.stream().filter(e -> Objects.equals(gender, e.getGender())).toList().forEach(System.out::println);

		System.out.println("----------------------");
		// Female employees whose salary more than ₹50,000

		employees.stream().filter(emp -> Objects.equals(gender, emp.getGender())).filter(e -> e.getSalary() > 50000)
				.forEach(System.out::println);
	}
}
