package com.virtusa.flatmapProject;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<String> skills;
	public Employee(int id, String name, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getSkills() {
		return skills;
	}
	
}
