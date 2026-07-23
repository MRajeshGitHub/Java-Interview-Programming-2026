package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program02_OptionalOfNullable {

	public static void main(String[] args) {
		
		Employee employee=null;
		
		Optional<Employee> optional= Optional.ofNullable(employee);//null accept in ofNullable
		
		System.out.println(optional);// gives Optional.empty
		
		Employee emp = new Employee(111, "Rajesh");
		
		Optional<Employee> ofNullable = Optional.ofNullable(emp);
		System.out.println(ofNullable);//gives Program02_OptionalOfNullable
		
		System.out.println(ofNullable.get());//gives  Employee [id=111, name=Rajesh]
		
		
	}
}
