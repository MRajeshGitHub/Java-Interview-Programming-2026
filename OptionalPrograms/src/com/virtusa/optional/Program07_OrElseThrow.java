package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program07_OrElseThrow {

	public static void main(String[] args) {
		
		Employee employee = null;//new Employee(333, "Rahul");
		
		Optional<Employee> optional= Optional.ofNullable(employee);
		System.out.println(optional);
		
		
		Employee result = optional.orElseThrow(()-> new RuntimeException("Employee not found"));
		System.out.println(result);
		
	}
}
