package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program12_ToMap {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(

                new Employee(101, "Rajesh", 50000),
                new Employee(102, "Amit", 65000),
                new Employee(103, "Sunil", 45000),
                new Employee(104, "Neha", 70000)

        );
		
		Map<Integer, Employee> collect = employees.stream().collect(Collectors.toMap(Employee::getId, e -> e));
				collect.forEach((i,e)->System.out.println(i+"--"+e));
				
				//Highest Salary Map
				Map<String, Integer> salaryMap = employees.stream()

				        .collect(Collectors.toMap(
				                Employee::getName,
				                Employee::getSalary
				        ));
				
				System.out.println(salaryMap);
				
				//Employee Id → Salary Map
				
				Map<Integer, Integer> salaryMap1 = employees.stream()

				        .collect(Collectors.toMap(
				                Employee::getId,
				                Employee::getSalary
				        ));

				System.out.println(salaryMap1);
	}
}
