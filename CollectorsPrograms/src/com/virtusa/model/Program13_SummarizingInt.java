package com.virtusa.model;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Program13_SummarizingInt {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Rajesh", 50000), new Employee(102, "Amit", 65000), new Employee(103, "Sunil", 45000),
				new Employee(104, "Neha", 70000)

		);

		IntSummaryStatistics statistics = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary));
		System.out.println(statistics);

		System.out.println("Count   : " + statistics.getCount());
		System.out.println("Sum     : ₹" + statistics.getSum());
		System.out.println("Average : ₹" + statistics.getAverage());
		System.out.println("Minimum : ₹" + statistics.getMin());
		System.out.println("Maximum : ₹" + statistics.getMax());
	}
}
