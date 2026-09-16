package com.virtusa.hashset;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<>();

		Employee emp1 = new Employee(101, "Rahul", "IT", 50000);

		Employee emp2 = new Employee(101, "Rahul", "IT", 60000);

		Employee emp3 = new Employee(102, "Amit", "HR", 70000);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		System.out.println("Employees:");
		System.out.println(employees);

		System.out.println();

		System.out.println("Total Employees: " + employees.size());
	}

}
