package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;

public class Program11FindEmpLocAndDepartment {

	public static void main(String[] args) {

		// Find Employees From Hyderabad AND Working in IT

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "IT", 29, 60000, "Pune", "Female"));

		String loc = "Hyderabad";
		String dept = "IT";

		List<Employee> list = employees.stream()
				.filter(emp -> loc.equals(emp.getCity()) && dept.equals(emp.getDepartment())).toList();
		list.forEach(System.out::println);
		
		//OUTPUT
		//Employee [id=101, name=Rajesh, department=IT, age=40, salary=70000.0, city=Hyderabad, gender=Male]
		//Employee [id=103, name=Rahul, department=IT, age=35, salary=85000.0, city=Hyderabad, gender=Male]


	}
}
