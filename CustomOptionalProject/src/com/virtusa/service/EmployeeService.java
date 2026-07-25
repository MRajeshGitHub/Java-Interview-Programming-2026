package com.virtusa.service;

import com.virtusa.exception.EmployeeNotFoundException;
import com.virtusa.repository.EmployeeRepository;

public class EmployeeService {

	
	 private EmployeeRepository repository = new EmployeeRepository();
	 	 
	 public String getEmployeeName(int id){

	        return repository

	                .findById(id)

	                // Active Employee
	                .filter(employee ->
	                        employee.isActive())

	                // Employee Name
	                .map(employee ->
	                        employee.getName())

	                // Exception
	                .orElseThrow(

	                        ()->new EmployeeNotFoundException(

	                                "Employee Not Found"

	                        )

	                );
	 }
}
