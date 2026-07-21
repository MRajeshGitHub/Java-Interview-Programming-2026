package com.virtusa.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.virtusa.model.Employee;

public class Program01_ComparingByName {

	public static void main(String[] args) {
		

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Rajesh", 31, 55000));
        employees.add(new Employee(101, "Amit", 28, 45000));
        employees.add(new Employee(105, "Deepak", 35, 70000));
        employees.add(new Employee(102, "Manoj", 30, 50000));
        employees.add(new Employee(104, "Vikas", 33, 60000));
        
        System.out.println("Before Sorting");
        System.out.println("---------------");

        employees.forEach(System.out::println);
        
        employees.sort(Comparator.comparing(Employee::getName));
        
        System.out.println("After Sorting");
        System.out.println("---------------");

        employees.forEach(System.out::println);
        
	}
}
