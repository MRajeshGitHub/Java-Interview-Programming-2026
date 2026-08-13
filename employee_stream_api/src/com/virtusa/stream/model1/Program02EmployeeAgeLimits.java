package com.virtusa.stream.model1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program02EmployeeAgeLimits {

	public static void main(String[] args) {

		// Employee age>30 in the list

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000), new Employee(102, "Amit", "HR", 28, 45000),
				new Employee(103, "Rahul", "IT", 35, 85000), new Employee(104, "Neha", "HR", 32, 55000),
				new Employee(105, "Vikas", "Sales", 25, 40000));

		List<Employee> empList = employees.stream().filter(emp -> emp.getAge() > 30).toList();

		System.out.println(empList);
		System.out.println("------------");

		List<Employee> list = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());

		System.out.println(list);
		System.out.println("------------");
		list.forEach(System.out::println);
	}

}
