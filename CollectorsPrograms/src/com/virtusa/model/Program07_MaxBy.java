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

		// System.out.println(maxBy);

		maxBy.ifPresent(System.out::println);// Employee [id=104, name=Neha, salary=70000]

		// Collectors.minBy

		Optional<Employee> minBy = employees.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

		minBy.ifPresent(System.out::println);// Employee [id=103, name=Sunil, salary=45000]

		// 2nd way both programs

		System.out.println("2nd way to process min");
		Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSalary));
		min.ifPresent(System.out::println);
		System.out.println("2nd way to process max");
		Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));
		max.ifPresent(System.out::println);

	}
}
