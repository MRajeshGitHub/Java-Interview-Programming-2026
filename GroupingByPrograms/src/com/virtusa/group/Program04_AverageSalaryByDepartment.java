package com.virtusa.group;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program04_AverageSalaryByDepartment {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 50000), new Employee(102, "Amit", "HR", 65000),
				new Employee(103, "Sunil", "IT", 45000), new Employee(104, "Neha", "HR", 70000),
				new Employee(105, "Pooja", "Admin", 55000), new Employee(106, "Rahul", "IT", 60000)

		);

		Map<String, Double> deptAvgSal = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
		deptAvgSal.forEach((detp, avgs) -> {
			System.out.println("Department : " + detp);
			System.out.println("-----");
			System.out.println("Average sal is :" + avgs);

		});
		System.out.println("===========================");
		System.out.println("Total Salary by Department");
		System.out.println("===========================");
		// Program05 - Total Salary by Department
		Map<String, Integer> totalSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));

		totalSalary.forEach((dept, sum) -> {
			System.out.println("Detp :" + dept);
			System.out.println("-----");
			System.out.println("Total Salary : " + sum);
		});

		System.out.println("===Highest Salary by Department====");
		// Program06 - Highest Salary by Department

		Map<String, Optional<Employee>> maxsal = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		maxsal.forEach((dept, maxsall) -> {
			/*
			 * System.out.println("Department :" + dept); System.out.println("------");
			 * System.out.println("Max Sal :" + maxsall.orElse(null));
			 */

			System.out.println("Department ::-> " + dept + "---Max-Sal Employee : " + maxsall.orElse(null));
		});
		System.out.println("========================================");

		// IT Department-Highest Salary Employee
		System.out.println("IT Department Highest Salary Employee");

		Map<String, Optional<Employee>> maxIt = employees.stream().filter(e -> e.getDepartment().equals("IT"))
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		maxIt.forEach((dept, max) -> {
			System.out.println("Department : " + dept + "---MaxSal --::" + max.orElse(null));
		});

		System.out.println("========================================");
		// Program07 - Lowest Salary by Department
		System.out.println("===Lowest Salary by Department===");

		Map<String, Optional<Employee>> minSal = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		minSal.forEach((dept, min) -> {
			System.out.println("Department : " + dept + "--MinSal-->" + min.orElse(null));
		});

	}
}
