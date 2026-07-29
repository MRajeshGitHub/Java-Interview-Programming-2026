package com.virtusa.model1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
	}
}
