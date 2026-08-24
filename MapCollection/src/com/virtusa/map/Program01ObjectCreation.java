package com.virtusa.map;

public class Program01ObjectCreation {

	public static void main(String[] args) {

		// Employee Object

		Employee emp = new Employee(1, "Rajesh", "IT", 10000.0);
		Employee emp1 = new Employee(1, "Rajesh", "IT", 10000.0);
		Employee emp2 = new Employee(2, "Vijay", "HR", 2000.0);
		Employee emp3 = new Employee(3, "Sanjay", "HR", 3300.0);
		emp.displayEmployee();// Employee Ordinary method
		System.out.println("-----------------------");
		emp1.displayEmployee();

		System.out.println(emp);// com.virtusa.map.Employee@6a79c292

		System.out.println(emp1);// com.virtusa.map.Employee@37574691
		System.out.println(emp2);
		System.out.println(emp3);

		System.out.println(emp == emp1);// false
	}

}
