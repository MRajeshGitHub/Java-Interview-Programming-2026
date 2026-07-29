package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program01_GroupByDepartment {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 50000), new Employee(102, "Amit", "HR", 65000),
				new Employee(103, "Sunil", "IT", 45000), new Employee(104, "Neha", "HR", 70000),
				new Employee(105, "Pooja", "Admin", 55000)

		);

		Map<String, List<Employee>> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		//System.out.println(group);
		
		group.forEach((dept,emp)->{System.out.println("Departmrnt : "+dept+"------"+emp);});		
	}
}
