package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program01_OptionalOf {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Rajesh");
		
		System.out.println(emp);
		
		//using Optional
		
		Optional<Employee> optionalEmployee=Optional.of(emp);
		System.out.println(optionalEmployee);
		System.out.println(optionalEmployee.get());
		
	}
}
