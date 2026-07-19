package com.virtusa.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program04_EmployeeSortingByName {

	public static void main(String[] args) {
		

        List<Employe> employees = new ArrayList<>();


        employees.add(new Employe(103, "Rajesh", 55000));
        employees.add(new Employe(101, "Amit", 45000));
        employees.add(new Employe(105, "Deepak", 70000));
        employees.add(new Employe(102, "Manoj", 50000));
        employees.add(new Employe(104, "Vikas", 60000));

        System.out.println("Before Sorting");
        employees.forEach(System.out::println);
        
        Collections.sort(employees);
        
        System.out.println("After Sorting");
        employees.forEach(System.out::println);
        

	}
}
