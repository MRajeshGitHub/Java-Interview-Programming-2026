package com.virtusa.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEmployees {

	public static void main(String[] args) {

		// Step 1: Duplicate Employee List

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(101, "Rahul", "IT", 50000));

		employeeList.add(new Employee(102, "Amit", "HR", 60000));

		employeeList.add(new Employee(101, "Rahul", "IT", 50000));

		employeeList.add(new Employee(103, "Priya", "Finance", 70000));

		employeeList.add(new Employee(102, "Amit", "HR", 60000));
		
		employeeList.add(new Employee(104, "Rahul", "IT", 80000));

		// Step 2: Original List

		System.out.println("Original List:");
		employeeList.forEach(System.out::println);

		System.out.println("Original Size: " + employeeList.size());

		// Step 3: List -> HashSet

		Set<Employee> empSet = new HashSet<>(employeeList);

		// Step 4: Unique Employees

		System.out.println("\nUnique Employees:");
		empSet.forEach(System.out::println);

		System.out.println("Unique Size: " + empSet.size());

		// Step 5: HashSet -> List

		List<Employee> uniqueEmployeeList = new ArrayList<>(empSet);

		System.out.println("\nUnique Employee List:");

		uniqueEmployeeList.forEach(System.out::println);
	}
}
