package com.virtusa.model1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program10_DepartmentGenderGrouping {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "Male", "IT", 50000), new Employee(102, "Amit", "Male", "HR", 65000),
				new Employee(103, "Sunil", "Male", "IT", 45000), new Employee(104, "Neha", "Female", "HR", 70000),
				new Employee(105, "Pooja", "Female", "Admin", 55000), new Employee(106, "Rahul", "Male", "IT", 60000),
				new Employee(107, "Priya", "Female", "IT", 58000)

		);

		Map<String, Map<String, List<Employee>>> nestedGroup = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));
		nestedGroup.forEach((dept, gen) -> {
			System.out.println("Department  : " + dept);
			System.out.println("---------------------");
			gen.forEach((Gen, emplist) -> {

				System.out.println("Gen     :" + Gen);
				System.out.println("EmpLIst :" + emplist);

			});
			System.out.println();
			System.out.println("-------------");
		});

		// Program11 - Department + Counting
		System.out.println("================Program11 - Department + Counting=========================");
		Map<String, Long> deptCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		deptCount.forEach((dept, count) -> {
			System.out.println("Department is :" + dept);
			System.out.println("Count Is : " + count);
		});

		System.out.println("================Program12 – Department + Mapping=========================");

		Map<String, List<String>> deptName = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		deptName.forEach((dept, name) -> {
			System.out.println("Department---> " + dept);
			System.out.println("Names :" + name);
		});

		// Program13 – Department + MaxBy
		System.out.println("================Program13 – Department + MaxBy=========================");

		Map<String, Optional<Employee>> maxBy = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		maxBy.forEach((dept, max) -> {
			System.out.println("Dept :" + dept);
			System.out.println("MaxSal :-->" + max.orElse(null));
		});
		// Lowest Salary
		System.out.println("================Program14 – Department + MinBy=========================");
		Map<String, Optional<Employee>> minby = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		minby.forEach((dept, min) -> {
			System.out.println("Detp : " + dept);
			System.out.println("Min Salary :" + min.orElse(null));
		});
	}
}
