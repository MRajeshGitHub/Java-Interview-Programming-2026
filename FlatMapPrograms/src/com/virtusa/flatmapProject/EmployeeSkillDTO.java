package com.virtusa.flatmapProject;

public class EmployeeSkillDTO {

	private String department;
	private String employeeName;
	private String skill;

	public EmployeeSkillDTO(String department, String employeeName, String skill) {
		super();
		this.department = department;
		this.employeeName = employeeName;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "EmployeeSkillDTO [department=" + department + ", employeeName=" + employeeName + ", skill=" + skill
				+ "]";
	}

}
