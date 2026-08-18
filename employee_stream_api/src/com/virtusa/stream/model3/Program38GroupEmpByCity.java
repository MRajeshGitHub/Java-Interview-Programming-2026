package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program38GroupEmpByCity {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Map<String, List<Employee>> list = employees.stream().collect(Collectors.groupingBy(Employee::getCity));

		list.forEach((dept, city) -> {
			System.out.println(dept);
			System.out.println("------");
			city.forEach(e -> System.out.println(e.getName() + "-----" + e.getCity()));
		});

		System.out.println("-------------------------------------------------------");
		System.out.println("------Program 33 — Group Employees by Gender.----------");

		Map<String, List<Employee>> gList = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
		gList.forEach((gen, elist) -> {
			System.out.println(gen);
			System.out.println("----------");
			elist.forEach(System.out::println);
		});

	}
}
