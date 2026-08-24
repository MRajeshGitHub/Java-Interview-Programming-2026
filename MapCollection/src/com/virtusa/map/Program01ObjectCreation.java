package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object

		Employee emp = new Employee(1, "Rajesh", "IT", 10000.0);
		Employee emp1 = new Employee(1, "Rajesh", "IT", 10000.0);

		System.out.println(emp == emp1);// false

		Employee emp2 = emp1;

		System.out.println(emp1);// com.virtusa.map.Employee@701fc37a

		System.out.println(emp2);// com.virtusa.map.Employee@701fc37a

		System.out.println(emp1 == emp2);// true

		emp2.name = "Amit";
		System.out.println(emp1.name);
	}

}
