package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object
		Employee e1 = new Employee(101, "Rahul", "IT", 50000);
		Employee e2 = new Employee(101, "Rahul", "HR", 70000);

		System.out.println(e1.equals(e2));// true

		Employee e3 = new Employee(101, "Rahul", "IT", 50000);
		Employee e4 = new Employee(102, "Rahul", "IT", 50000);

		System.out.println(e3.equals(e4));// false

		Employee e5 = new Employee(101, "Rahul", "IT", 50000);
		Employee e6 = new Employee(101, "RAHUL", "IT", 50000);

		System.out.println(e5.equals(e6));//false
		
		
		

	}

}
