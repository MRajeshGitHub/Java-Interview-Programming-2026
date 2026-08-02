package com.virtusa.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program05_EmployeeSalarySum {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000),

				new Employee(102, "Amit", 60000),

				new Employee(103, "Rahul", 45000),

				new Employee(104, "Neha", 70000)

		);

		// Using collecotrs
		Double salarySum = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(salarySum);

		// Using reduce

		Optional<Double> reduceSum = employees.stream().map(Employee::getSalary).reduce(Double::sum);

		System.out.println("Employee salary sum is :" + reduceSum.orElse(null));
	}
}
