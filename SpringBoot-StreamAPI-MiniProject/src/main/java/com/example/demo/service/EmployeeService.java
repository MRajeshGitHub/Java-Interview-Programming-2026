package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(101, "Rajesh", "IT", 60000, true),
				new Employee(102, "Rahul", "HR", 35000, true), new Employee(103, "Amit", "IT", 75000, false),
				new Employee(104, "Neha", "Finance", 90000, true), new Employee(105, "Priya", "IT", 50000, true));
	}

}
