package com.virtusa.model;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Program05_SummingInt {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		//sum
		Integer sum = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Salary sum : " + sum);//Salary sum : 230000
		
		//Ave
		Double avg = employees.stream().collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println("Salary AVG : " + avg);//alary AVG : 57500.0
		
		


	}
}
