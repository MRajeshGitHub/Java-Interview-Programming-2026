package com.virtusa.employeevalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(101, "Rahul Sharma", 28, 65000.0, "rahul@example.com", "IT"));
		employeeList.add(new Employee(102, "Priya Verma", 25, 48000.0, "priya@example.com", "HR"));
		employeeList.add(new Employee(103, "Amit Kumar", 32, 75000.0, "amit@example.com", "Finance"));
		employeeList.add(new Employee(104, "Neha Singh", 29, 52000.0, "neha@example.com", "Marketing"));
		employeeList.add(new Employee(105, "Vikas Gupta", 35, 88000.0, "vikas@example.com", "IT"));
		employeeList.add(new Employee(106, "Pooja Patel", 26, 45000.0, "pooja@example.com", "Sales"));
		employeeList.add(new Employee(107, "Suresh Raina", 31, 70000.0, "suresh@example.com", "Operations"));

		// Name Validation:-> Name !=null and not Empty

		Predicate<Employee> validate = emp -> emp.getName() != null && emp.getName().isBlank();
		System.out.println(validate.test(employeeList.get(0)));

		
		//Age Validation :-> Age>18
		
		Predicate<Employee> ageValid= emp->emp.getAge()>=18;
		System.out.println(ageValid.test(employeeList.get(5)));//true
	}
}
