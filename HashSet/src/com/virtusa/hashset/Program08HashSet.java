package com.virtusa.hashset;

import java.util.HashSet;
import java.util.Set;

public class Program08HashSet {

	public static void main(String[] args) {

		Set<String> employees = new HashSet<>();

		employees.add("Rahul");
		employees.add("Amit");
		employees.add("Priya");
		employees.add("Rahul");
		employees.add("Amit");

		System.out.println("Employees : " + employees);

		System.out.println(employees.size());
		System.out.println(employees.contains("Rahul"));// true
		System.out.println(employees.contains("Raj"));// false
		System.out.println(employees.contains("Amit"));// true

		employees.remove("Amit");
		System.out.println(employees);
		
		//System.out.println(employees.add("Raj"));

		System.out.println(employees.add("Raj"));

	}

}
