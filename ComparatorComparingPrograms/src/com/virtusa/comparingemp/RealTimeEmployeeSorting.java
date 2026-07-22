package com.virtusa.comparingemp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RealTimeEmployeeSorting {

	public static void main(String[] args) {
		
	     List<Employee> employees = new ArrayList<>();

	        employees.add(new Employee(101, "Rajesh", "IT", 5, 85000));
	        employees.add(new Employee(102, "Amit", "HR", 4, 65000));
	        employees.add(new Employee(103, "Deepak", "IT", 5, 90000));
	        employees.add(new Employee(104, "Vikas", "Finance", 7, 80000));
	        employees.add(new Employee(105, "Manoj", "IT", 3, 90000));
	        employees.add(new Employee(106, "Suresh", "HR", 6, 65000));
	        employees.add(new Employee(107, "Ankit", "Finance", 5, 80000));

	        System.out.println("Before Sorting\n");

	        employees.forEach(System.out::println);
	        System.out.println("------");
	        
	        employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)
	        		.reversed().thenComparing(Employee::getExperience)
	        		.reversed().thenComparing(Employee::getName));
	        employees.forEach(System.out::println);
	        
	}
}
