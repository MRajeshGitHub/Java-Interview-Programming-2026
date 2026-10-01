package com.vs.stream;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String department;
	private String city;
	private Double salary; // Double wrapper 
	private String gender;

	public Employee(int id, String name, int age, String department, String city, Double salary, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
	}

	// getters (Windows STS में Alt+Shift+S → Generate Getters )
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public String getCity() {
		return city;
	}

	public Double getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return id + " | " + name + " | " + age + " | " + department + " | " + city + " | " + salary + " | " + gender;
	}
}
