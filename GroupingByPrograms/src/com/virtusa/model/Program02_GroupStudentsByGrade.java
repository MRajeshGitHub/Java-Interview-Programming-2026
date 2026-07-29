package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program02_GroupStudentsByGrade {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(

				new Student(101, "Rajesh", "A", 91), new Student(102, "Amit", "B", 78),
				new Student(103, "Neha", "A", 95), new Student(104, "Pooja", "C", 60),
				new Student(105, "Rahul", "B", 82), new Student(106, "Sunil", "A", 89)

		);

		Map<String, List<Student>> grade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
		grade.forEach((grad, list) -> {
			System.out.println("Grade is : " + grad);
			System.out.println("----------");
			list.forEach(System.out::println);
			System.out.println("=============");
		});
		System.out.println("=============================================");
		// grade A student list

		Map<String, List<Student>> sgrade = students.stream().filter(stu -> stu.getGrade().equals("A"))
				.collect(Collectors.groupingBy(Student::getGrade));

		sgrade.forEach((sgr, slist) -> {
			System.out.println("Grade is : " + sgr);
			System.out.println("------");
			slist.forEach(System.out::println);
			System.out.println("---------");
		});
	}
}
