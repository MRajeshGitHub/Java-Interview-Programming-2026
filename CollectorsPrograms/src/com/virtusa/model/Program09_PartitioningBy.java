package com.virtusa.model;

import static java.util.stream.Collectors.partitioningBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program09_PartitioningBy {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		Map<Boolean, List<Employee>> partitionBy = employees.stream()
				.collect(partitioningBy(e -> e.getSalary() > 50000));

		System.out.println("Salary >= 50000");
		partitionBy.get(true).forEach(System.out::println);

		System.out.println("Salary <= 50000");
		partitionBy.get(false).forEach(System.out::println);

		// True and False counting

		Map<Boolean, Long> couning = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 50000, Collectors.counting()));
		System.out.println(couning);
	}
}
