package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object

		Employee emp1 = new Employee(101, "Rahul", "IT", 50000);

		Employee emp2 = new Employee(101, "Rahul", "IT", 60000);

		Employee emp3 = new Employee(102, "Rahul", "IT", 50000);

		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));

	}

}
