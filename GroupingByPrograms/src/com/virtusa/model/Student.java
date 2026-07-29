package com.virtusa.model;

public class Student {

	private int id;
	private String name;
	private String grade;
	private int marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", marks=" + marks + "]";
	}

	public Student(int id, String name, String grade, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
}
