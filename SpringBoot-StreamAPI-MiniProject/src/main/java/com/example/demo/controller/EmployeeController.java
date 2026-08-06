package com.example.demo.controller;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/stream")
	public String streamDemp() {
		List<Employee> employees = employeeService.getEmployees();

		// 1. Active Employees

		List<Employee> actEmp = employees.stream().filter(Employee::isActive).toList();

		System.out.println("Active employee  is : " + actEmp);

		//// 2. Names

		List<String> ename = employees.stream().map(Employee::getName).toList();
		System.out.println("Employee Names : " + ename);

		// 3. Uppercase Names

		List<String> empUpper = employees.stream().map(Employee::getName).map(String::toUpperCase).toList();

		System.out.println("Employee name Upper case : " + empUpper);

		// 4. Total Salary

		Double salary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));

		System.out.println("Total salary is : " + salary);

		// 5 Average Salary

		Double aveSal = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println("Average salary is : " + aveSal);

		// 6 Group By Department

		Map<String, List<Employee>> dept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		dept.forEach((e1, e2) -> {
			System.out.println("Department : " + e1);
			System.out.println("----------------");
			System.out.println("Employee list is :" + e2);
		});

		// 7 Highest Salary Employee
		System.out.println("----------------");

		Optional<Employee> max = Optional
				.ofNullable(employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null));

		System.out.println("max sal is : " + max);

		// 8 First Employee
		System.out.println("----------------");

		Optional<Employee> first = Optional.ofNullable(employees.stream().findFirst().orElse(null));
		System.out.println(first);

		// 9 Any Employee Salary > 10000

		employees.stream().filter(e -> e.getSalary() > 10000).forEach(System.out::println);

		// 10 All Employees Active

		Stream<Boolean> isActive = employees.stream().map(Employee::isActive);
		isActive.forEach(System.out::println);

		return "Stream Operations executed successfully! Check the STS Console.";
	}
}
