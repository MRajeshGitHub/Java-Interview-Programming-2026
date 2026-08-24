package com.virtusa.map;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return this.id == other.id && this.name.equals(other.name);
	}

}
