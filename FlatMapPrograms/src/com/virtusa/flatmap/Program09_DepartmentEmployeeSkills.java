package com.virtusa.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.virtusa.model.Department;
import com.virtusa.model.Employee;

public class Program09_DepartmentEmployeeSkills {

	public static void main(String[] args) {

		// IT Employee Details
		Department it = new Department("IT", Arrays.asList(new Employee(101, "Rajesh", Arrays.asList("Java", "Spring")),
				new Employee(102, "Amit", Arrays.asList("SQL", "Docker"))));

		// HR Employee Details
		Department hr = new Department("HR",
				Arrays.asList(new Employee(103, "Rahul", Arrays.asList("Communication", "Excel")),
						new Employee(104, "Neha", Arrays.asList("Recruitment", "Excel"))));

		List<Department> departments = Arrays.asList(it, hr);

		List<String> dlist = departments.stream().flatMap(d -> d.getEmployees().stream())
				.flatMap(e -> e.getSkills().stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println(dlist);
	}
}
