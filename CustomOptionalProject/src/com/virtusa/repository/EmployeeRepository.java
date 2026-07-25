package com.virtusa.repository;

import java.util.Optional;

import com.virtusa.model.Employee;

public class EmployeeRepository {

	public Optional<Employee> findById(int id){

	        if(id==101){

	            return Optional.of(

	                new Employee(
	                        101,
	                        "Rajesh",
	                        "IT",
	                        true)

	            );

	        }

	        return Optional.empty();
	}
}
