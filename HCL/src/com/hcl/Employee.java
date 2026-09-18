package com.hcl;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private String city;
	private Double salary; // Null Value test करने के लिए Double object
	private LocalDate joiningDate;

	public Employee(int id, String name, int age, String gender, String department, String city, Double salary,
			LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.city = city;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", city=" + city + ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
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

	public String getGender() {
		return gender;
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

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

}
