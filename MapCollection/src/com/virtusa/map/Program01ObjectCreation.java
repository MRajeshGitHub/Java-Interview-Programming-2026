package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object

		Employee emp = new Employee(1, "Rajesh", "IT", 10000.0);
		Employee emp1 = new Employee(2, "Ajay", "HR", 20000.0);

		emp.displayEmployee();// Employee Ordinary method
		System.out.println("-----------------------");
		emp1.displayEmployee();
	}

}
