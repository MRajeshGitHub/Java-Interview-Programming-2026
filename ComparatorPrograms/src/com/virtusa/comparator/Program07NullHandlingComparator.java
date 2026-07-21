package com.virtusa.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.virtusa.model.Employee;

public class Program07NullHandlingComparator {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rajesh", 31, 55000.0));
        employees.add(new Employee(102, null, 28, 45000.0));
        employees.add(new Employee(103, "Amit", 35, 70000.0));
        employees.add(new Employee(104, null, 30, 50000.0));
        employees.add(new Employee(105, "Deepak", 33, 60000.0));

        System.out.println("Before Sorting");

        employees.forEach(System.out::println);
        
        employees.sort(Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo)));
        System.out.println("Null check from first point..");
        employees.forEach(System.out::println);
        
        employees.sort(Comparator.comparing(Employee::getName,Comparator.nullsLast(String::compareTo)));
        
        System.out.println("Null check from Last point..");
        employees.forEach(System.out::println);
        
	}
}
