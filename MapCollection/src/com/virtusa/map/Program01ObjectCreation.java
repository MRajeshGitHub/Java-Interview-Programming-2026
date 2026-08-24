package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object

		Employee emp = new Employee(1, "Rajesh", "IT", 10000.0);
		Employee emp1 = new Employee(1, "Rajesh", "IT", 10000.0);

		System.out.println(emp == emp1);// false
		System.out.println(emp.equals(emp1));// false

		Employee emp2 = emp1;
		System.out.println(emp1 == emp2);// true
		System.out.println(emp1.equals(emp2));// true

	}

}
