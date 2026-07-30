package com.virtusa.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program15_GroupOptional {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 50000), new Employee(102, "Amit", "HR", 65000),
				new Employee(103, "Sunil", "IT", 45000), new Employee(104, "Neha", "HR", 70000),
				new Employee(105, "Pooja", "Admin", 55000), new Employee(106, "Rahul", "IT", 60000)

		);

		Map<String, Employee> collect = employees.stream()

				.collect(Collectors.groupingBy(

						Employee::getDepartment,

						Collectors.collectingAndThen(

								Collectors.maxBy(

										Comparator.comparingInt(Employee::getSalary)

								),

								Optional::get

						)

				));
		collect.forEach((dept, emp) -> {
			System.out.println(dept);
			System.out.println(emp);

		});

	}
}
