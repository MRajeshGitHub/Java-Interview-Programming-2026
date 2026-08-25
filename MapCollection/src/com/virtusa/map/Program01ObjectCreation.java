package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Rahul", "IT", 50000);

		Employee emp2 = new Employee(101, "Rahul", "HR", 60000);

		Employee emp3 = new Employee(102, "Amit", "IT", 70000);

		System.out.println(emp1.equals(emp2));// true

		System.out.println(emp1.equals(emp3));// false

		System.out.println("-------------------------");

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

	}

}
