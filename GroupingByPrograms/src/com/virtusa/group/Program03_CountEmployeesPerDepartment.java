package com.virtusa.group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program03_CountEmployeesPerDepartment {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 50000), new Employee(102, "Amit", "HR", 65000),
				new Employee(103, "Sunil", "IT", 45000), new Employee(104, "Neha", "HR", 70000),
				new Employee(105, "Pooja", "Admin", 55000), new Employee(106, "Rahul", "IT", 60000)

		);

		// Count Employee per department

		Map<String, Long> egroup = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(egroup);

		egroup.forEach((dept, count) -> {
			System.out.println("Department : " + dept);
			System.out.println("-----");
			System.out.println("Counts : " + count);
			System.out.println("======");
		});
		System.out.println("-----------------");
		// IT -Department Count

		Map<String, Long> IT = employees.stream().filter(e -> e.getDepartment().equals("IT"))
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		IT.forEach((dept, count) -> {
			System.out.println("Dept : " + dept);
			System.out.println("--");
			System.out.println("count : " + count);
		});

	}
}
