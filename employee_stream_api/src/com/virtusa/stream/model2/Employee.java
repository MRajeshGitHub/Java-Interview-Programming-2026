package com.virtusa.stream.model2;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int age;
	private double salary;
	private String city;

	public Employee(int id, String name, String department, int age, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", salary="
				+ salary + ", city=" + city + "]";
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

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

}
