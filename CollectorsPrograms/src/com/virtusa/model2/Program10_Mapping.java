package com.virtusa.model2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program10_Mapping {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", "IT", 50000), new Employee(102, "Amit", "IT", 65000),
				new Employee(103, "Sunil", "HR", 45000), new Employee(104, "Neha", "HR", 70000),
				new Employee(105, "Pooja", "Admin", 55000)

		);

		Map<String, List<String>> maping = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(maping);//{HR=[Sunil, Neha], IT=[Rajesh, Amit], Admin=[Pooja]}

	}
}
