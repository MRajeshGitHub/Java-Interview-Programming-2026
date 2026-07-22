package com.virtusa.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.virtusa.model.Employee;

public class Program03_ComparingDoubleBySalary {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(103, "Rajesh", 31, 55000.50));
		employees.add(new Employee(101, "Amit", 28, 45000.75));
		employees.add(new Employee(105, "Deepak", 35, 70000.25));
		employees.add(new Employee(102, "Manoj", 30, 50000.10));
		employees.add(new Employee(104, "Vikas", 33, 60000.80));

		System.out.println("Before Sorting");

		employees.forEach(System.out::println);

		employees.sort(Comparator.comparingDouble(Employee::getSalary));

		System.out.println("After Sorting");

		employees.forEach(System.out::println);
		
		
		//// reversed() with comparing
		employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed()); 
		System.out.println("After Sorting Reversed");

		employees.forEach(System.out::println);
	}
}
