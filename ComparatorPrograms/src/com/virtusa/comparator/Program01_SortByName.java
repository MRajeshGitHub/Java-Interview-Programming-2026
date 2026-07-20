package com.virtusa.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.virtusa.model.Employee;

public class Program01_SortByName {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(103, "Rajesh", 31, 55000));
		employees.add(new Employee(101, "Amit", 28, 45000));
		employees.add(new Employee(105, "Deepak", 35, 70000));
		employees.add(new Employee(102, "Manoj", 30, 50000));
		employees.add(new Employee(104, "Vikas", 33, 60000));

		System.out.println("Before Sorting");
		employees.forEach(System.out::println);

		// Comparator Anonymous logic type sort by name
	/*	Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		*/
		// sort by age
		/*Comparator<Employee> comparator2 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
		};*/

		Comparator<Employee> comparator3 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
		};
		//sort by salary
		Comparator<Employee> comparator4 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSalary().compareTo(o2.getSalary());
			}
		};
		

		System.out.println("Name Sorting");
		employees.forEach(System.out::println);

		//// sort by Age print
		Collections.sort(employees, new SeparateComparator());

		System.out.println("Age Sorting");
		employees.forEach(System.out::println);

		//// sort by ID print
		Collections.sort(employees, comparator3);

		System.out.println("ID Sorting");
		employees.forEach(System.out::println);
		
		//// sort by Salary print
		Collections.sort(employees, comparator4);

		System.out.println("salary Sorting");
		employees.forEach(System.out::println);
		
		//using lamda sorting
		System.out.println("=====");
		Comparator<Employee> com=(e1,e2)->e1.getName().compareTo(e2.getName());
		System.out.println("=============");
		//// sort by name print
		Collections.sort(employees, com);
		employees.forEach(System.out::println);
		
		System.out.println("---------Comparator.comparing() (Modern Java)---------");
		
		Comparator<Employee> comp= Comparator.comparing(Employee::getId).reversed();
		employees.sort(comp);
		employees.forEach(System.out::println);
		
	}
}
