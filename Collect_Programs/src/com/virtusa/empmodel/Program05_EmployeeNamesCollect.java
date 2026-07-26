package com.virtusa.empmodel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program05_EmployeeNamesCollect {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		List<String> enames = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Employee List" + employees);
		// Employee List[Employee [id=101, name=Rajesh, salary=50000.0], Employee
		// [id=102, name=Amit, salary=65000.0],
		// Employee [id=103, name=Sunil, salary=45000.0], Employee [id=104, name=Neha,
		// salary=70000.0]]

		System.out.println("Employee names :");
		System.out.println(enames);// Employee names :[Rajesh, Amit, Sunil, Neha]

		// Using java 16

		List<String> list = employees.stream().map(Employee::getName).toList();
		System.out.println(list);// [Rajesh, Amit, Sunil, Neha]

		// Convert into upper case

		List<String> list2 = employees.stream().map(Employee::getName).map(String::toUpperCase).toList();
		System.out.println("Upper Case covert list using java 16");
		System.out.println(list2);// [RAJESH, AMIT, SUNIL, NEHA]
	}
}
