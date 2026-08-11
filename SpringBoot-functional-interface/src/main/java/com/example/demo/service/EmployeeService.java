package com.example.demo.service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeResponse;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	public List<EmployeeResponse> getITEmployee() {

		List<Employee> employees = List.of(new Employee(101, "Rajesh", 25, 60000, "IT"),

				new Employee(102, "Rahul", 30, 70000, "HR"),

				new Employee(103, "Amit", 22, 45000, "IT")

		);
		Predicate<Employee> isIT = employee -> employee.getDepartment().equals("IT");

		Function<Employee, EmployeeResponse> mapper = employee -> new EmployeeResponse(employee.getId(),
				employee.getName(), employee.getDepartment());

		Consumer<Employee> logger = employee -> System.out.println("Processing: " + employee.getName());

		return employees.stream()

				.peek(logger)

				.filter(isIT)

				.map(mapper)

				.toList();
	}
}
