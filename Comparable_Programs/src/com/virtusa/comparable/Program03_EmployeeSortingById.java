package com.virtusa.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.virtusa.comparable.model.Employee;

public class Program03_EmployeeSortingById {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		    employees.add(new Employee(103, "Rajesh", 55000));
	        employees.add(new Employee(101, "Amit", 45000));
	        employees.add(new Employee(105, "Deepak", 70000));
	        employees.add(new Employee(102, "Manoj", 50000));
	        employees.add(new Employee(104, "Vikas", 60000));
	        
	        System.out.println("Before Sorting");
	        employees.forEach(System.out::println);
	         Collections.sort(employees);
	         
	         System.out.println("After Sorting");
		        employees.forEach(System.out::println);
	        
	}
}
