package com.virtusa.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program07_MaxBy {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		Optional<Employee> maxBy = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		//System.out.println(maxBy);
		
		maxBy.ifPresent(System.out::println);

	}
}
