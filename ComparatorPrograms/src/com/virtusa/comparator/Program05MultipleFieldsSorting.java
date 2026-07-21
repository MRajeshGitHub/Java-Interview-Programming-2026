package com.virtusa.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.virtusa.model.Employee;

public class Program05MultipleFieldsSorting {

	public static void main(String[] args) {
		
		 List<Employee> employees = new ArrayList<>();

	        employees.add(new Employee(101, "Amit", 28, 50000.0));
	        employees.add(new Employee(102, "Rajesh", 30, 60000.0));
	        employees.add(new Employee(103, "Deepak", 35, 50000.0));
	        employees.add(new Employee(104, "Manoj", 29, 60000.0));
	        employees.add(new Employee(105, "Vikas", 31, 50000.0));

	        System.out.println("Before Sorting");

	        employees.forEach(System.out::println);
	        
	        
	        ////sort Name and salary
	        
	   
	        
	        employees.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
	        System.out.println("After Salary -> Name Sorting");
	        System.out.println("After Sorting with Salary and Name.");
	        employees.forEach(System.out::println);
	        
	        
	}
}
