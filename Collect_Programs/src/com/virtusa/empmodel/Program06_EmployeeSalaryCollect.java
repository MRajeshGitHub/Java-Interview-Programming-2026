package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program06_EmployeeSalaryCollect {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		List<Double> collect = employees.stream().map(Employee::getSalary).collect(Collectors.toList());

		System.out.println("Employee Salary is : ");
		System.out.println(collect);

		// salary more then 50000

		List<Double> collect2 = employees.stream().filter(s -> s.getSalary() >= 50000).map(Employee::getSalary)
				.collect(Collectors.toList());

		System.out.println("Salary more than 50000");
		System.out.println(collect2);

		// Add Bonus in salary

		List<Double> collect3 = employees.stream().map(e -> e.getSalary() + 5000).collect(Collectors.toList());
		System.out.println("After Bonus 5000 Salary is :");
		System.out.println(collect3);
		
		
		//using Java 16
		
		List<Double> list = employees.stream().filter(e->e.getSalary()>=50000).map(Employee::getSalary).toList();
		System.out.println("Using java 16");
		System.out.println(list);
		
		List<Double> list2 = employees.stream().map(e->e.getSalary()+5000).toList();
		System.out.println(list2);
		
		
		
		
		
	}
}
