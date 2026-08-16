package com.virtusa.stream.model4;

public class Employee {
	private int id;
	private String name;
	private String department;
	private int age;
	private Double salary; // null allow  Double (Wrapper class)
	private String city;
	private String gender;

	// Constructor
	public Employee(int id, String name, String department, int age, Double salary, String city, String gender) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.gender = gender;
	}

	// Getters
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

	public Double getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", age="
				+ age + ", salary=" + salary + ", city='" + city + '\'' + ", gender='" + gender + '\'' + '}';
	}
}