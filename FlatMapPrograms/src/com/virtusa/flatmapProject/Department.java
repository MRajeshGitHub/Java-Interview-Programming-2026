package com.virtusa.flatmapProject;

import java.util.List;

public class Department {

	private String departmentName;
	private List<Employee> employees;

	public Department(String departmentName, List<Employee> employees) {
		super();
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
