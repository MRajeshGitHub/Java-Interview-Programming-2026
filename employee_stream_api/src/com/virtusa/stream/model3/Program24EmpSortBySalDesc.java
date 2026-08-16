package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program24EmpSortBySalDesc {

	public static void main(String[] args) {

		// Sort Employees by Salary in Descending Order (High → Low)

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		List<Employee> salList = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());

		System.out.println("Sort Employees by Salary in Descending Order (High → Low) : ");
		salList.forEach(System.out::println);

		System.out.println("===========================");
		// only salary descending

		List<Double> list = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
		System.out.println("only salary descending :");
		list.forEach(System.out::println);
	}
}
