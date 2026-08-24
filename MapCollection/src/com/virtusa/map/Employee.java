package com.virtusa.map;

public class Employee {

	int id;
	String name;
	String department;
	double salary;

	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	void displayEmployee() {
		System.out.println("Employee ID   : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : " + salary);
	}
}
