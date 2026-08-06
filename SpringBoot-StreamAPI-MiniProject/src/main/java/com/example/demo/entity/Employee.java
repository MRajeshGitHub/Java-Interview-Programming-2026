package com.example.demo.entity;

public class Employee {

	private int id;
	private String name;
	private String department;
	private double salary;
	private boolean active;

	public Employee(int id, String name, String department, double salary, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", active=" + active + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActive() {
		return active;
	}

}
