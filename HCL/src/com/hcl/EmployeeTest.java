package com.hcl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1, "Aman", 32, "Male", "IT", "Delhi", 75000.0, LocalDate.of(2019, 3, 15)),
				new Employee(2, "Ankit", 28, "Male", "IT", "Bangalore", 45000.0, LocalDate.of(2021, 6, 10)),
				new Employee(3, "Priya", 35, "Female", "HR", "Delhi", 85000.0, LocalDate.of(2018, 1, 20)),
				new Employee(4, "Sunil", 40, "Male", "Finance", "Mumbai", 95000.0, LocalDate.of(2015, 11, 5)),
				new Employee(5, "Anita", 26, "Female", "IT", "Delhi", 35000.0, LocalDate.of(2022, 8, 12)),
				new Employee(6, "Rohan", 31, "Male", "Finance", "Bangalore", 60000.0, LocalDate.of(2020, 4, 18)),
				new Employee(7, "Aman", 32, "Male", "IT", "Delhi", 75000.0, LocalDate.of(2019, 3, 15)), // Duplicate
																										// Record
				new Employee(8, null, 29, "Male", "HR", "Mumbai", 50000.0, LocalDate.of(2021, 2, 28)), // Null Name
				new Employee(9, "Kiran", 34, "Female", "HR", "Delhi", null, LocalDate.of(2017, 9, 14)) // Null Salary
		);

		// Testing age >30

		List<Employee> ageList = list.stream().filter(i -> i.getAge() > 30).toList();

		ageList.forEach(System.out::println);

		System.out.println("---------------------------------");

		// IT Department employees

		List<Employee> ITList = list.stream().filter(i -> i.getDepartment().equals("IT")).collect(Collectors.toList());
		ITList.forEach(System.out::println);

	}

}
