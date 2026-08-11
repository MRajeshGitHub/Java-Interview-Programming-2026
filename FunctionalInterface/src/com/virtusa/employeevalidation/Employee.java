package com.virtusa.employeevalidation;

public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private String email;
	private String department;

	public Employee(int id, String name, int age, double salary, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.email = email;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", email=" + email
				+ ", department=" + department + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	public String getDepartment() {
		return department;
	}

}
