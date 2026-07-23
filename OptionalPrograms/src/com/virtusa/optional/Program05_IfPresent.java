package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program05_IfPresent {

	public static void main(String[] args) {
		
		Employee employee = new Employee(123, "Rajesh");
		
		Optional<Employee>  optional= Optional.ofNullable(employee);
		
		System.out.println(optional);//Optional[Employee [id=123, name=Ajay]]
		 
		System.out.println("------");
		optional.ifPresent(System.out::println);// sort way
		System.out.println("------");

		
		optional.ifPresent(o->{
			System.out.println("Emp is Present.");//Emp is Present.
			System.out.println(employee);//Employee [id=123, name=Rajesh]
			System.out.println("Get emp Name : "+employee.getName());//Get emp Name : Rajesh
		});
		
		
		//with Null values
		System.out.println("--------------------");
		
		Employee employee1 = null;

		Optional<Employee> optionalEmployee =
		        Optional.ofNullable(employee1);

		optionalEmployee.ifPresent(emp -> {

		    System.out.println(emp);

		});
	}
}
