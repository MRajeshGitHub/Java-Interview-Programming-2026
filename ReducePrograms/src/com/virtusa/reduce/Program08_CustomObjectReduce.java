package com.virtusa.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program08_CustomObjectReduce {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000),

				new Employee(102, "Amit", 70000),

				new Employee(103, "Rahul", 45000),

				new Employee(104, "Neha", 90000)

		);

		// highestSalaryEmployee

		Optional<Employee> maxSal = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		System.out.println("Max salary is : " + maxSal.orElse(null));

		// highestSalaryEmployee using reduce

		Employee maxSal1 = employees.stream().reduce((a, b) -> a.getSalary() > b.getSalary() ? a : b).orElse(null);

		System.out.println("max sal is :" + maxSal1);

		// 1. Lowest Salary Employee

		Employee minSal = employees.stream().reduce((a, b) -> a.getSalary() < b.getSalary() ? a : b).orElse(null);

		System.out.println("Min sal is : " + minSal);

		// 2. Longest Employee Name

		Employee longestName = employees.stream().reduce((a, b) -> a.getName().length() > b.getName().length() ? a : b)
				.orElse(null);

		System.out.println("Longest Employee Name : " + longestName);
	}

}
