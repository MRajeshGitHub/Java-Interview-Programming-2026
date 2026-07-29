package com.virtusa.group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
	}
}
