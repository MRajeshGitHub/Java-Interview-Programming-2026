package com.virtusa.stream.model3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program32GroupEmpByDept {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 40, 70000, "Hyderabad", "Male"),

				new Employee(102, "Amit", "HR", 28, 45000, "Delhi", "Male"),

				new Employee(103, "Rahul", "IT", 35, 85000, "Hyderabad", "Male"),

				new Employee(104, "Neha", "HR", 32, 55000, "Mumbai", "Female"),

				new Employee(105, "Priya", "Sales", 29, 60000, "Pune", "Female"));

		Map<String, List<Employee>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		groupByDept.forEach((dept, list) -> {
			System.out.println(dept);
			System.out.println("----------");
			list.forEach(System.out::println);
		});
		System.out.println("----------Using filter group by department-----------");

		// Using filter group by department

		String dept = "IT";

		List<Employee> deptList = employees.stream().filter(emp -> dept.equals(emp.getDepartment()))
				.collect(Collectors.toList());

		deptList.forEach(System.out::println);
	}

}
