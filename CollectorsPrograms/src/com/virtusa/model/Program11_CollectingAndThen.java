package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program11_CollectingAndThen {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		List<Employee> elist = employees.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), List::copyOf));

		//elist.add(111,"Ajay",40987);/not allowed
		elist.forEach(System.out::println);
	}
}
