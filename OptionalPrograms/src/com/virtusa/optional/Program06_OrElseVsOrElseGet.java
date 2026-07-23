package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program06_OrElseVsOrElseGet {

	public static void main(String[] args) {

		Employee employee = new Employee(222, "Arun"); //null optional check

		Optional<Employee> optional = Optional.ofNullable(employee);
		System.out.println(optional);// Optional[Employee [id=222, name=Arun]]

		System.out.println("----- orElse() -----");

		Employee emp1 = optional.orElse(getDefaultEmployee());

		System.out.println(emp1);

		System.out.println();

		System.out.println("----- orElseGet() -----");
		
		Employee emp2=optional.orElseGet(()-> getDefaultEmployee());
		System.out.println(emp2);

	}

	// seprate employe method
	private static Employee getDefaultEmployee() {

		System.out.println("Creating Default Employee...");

		return new Employee(999, "Default Employee");

	}
}
