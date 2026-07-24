package com.virtusa.optional;

import java.util.Optional;

public class Program09_Filter {

	public static void main(String[] args) {
		
		 Employee employee =
	                new Employee(101, "Rajesh", 50000);

	        Optional<Employee> optionalEmployee =
	                Optional.ofNullable(employee);

	        Optional<Employee> result =
	                optionalEmployee.filter(emp -> emp.getSalary() >= 40000);

	        System.out.println(result);
		
		
	}
}
