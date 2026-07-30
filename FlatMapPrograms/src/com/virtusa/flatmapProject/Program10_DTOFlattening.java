package com.virtusa.flatmapProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program10_DTOFlattening {

	public static void main(String[] args) {

		Department it = new Department("IT", Arrays.asList(

				new Employee(101, "Rajesh", Arrays.asList("Java", "Spring")),

				new Employee(102, "Amit", Arrays.asList("SQL", "Docker"))

		));

		List<Department> departments = Arrays.asList(it);

		List<EmployeeSkillDTO> collect = departments.stream()

				.flatMap(department ->

				department.getEmployees().stream()

						.flatMap(employee ->

						employee.getSkills().stream()

								.map(skill ->

								new EmployeeSkillDTO(

										department.getDepartmentName(),

										employee.getName(),

										skill)

								)

						)

				)

				.collect(Collectors.toList());

		collect.forEach(System.out::println);

	}
}
