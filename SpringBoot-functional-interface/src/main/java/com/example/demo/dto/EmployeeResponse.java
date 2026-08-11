package com.example.demo.dto;

public class EmployeeResponse {

	private int id;
    private String name;
	private String department;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public EmployeeResponse(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
}
