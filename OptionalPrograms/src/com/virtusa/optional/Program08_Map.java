package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program08_Map {

	public static void main(String[] args) {
		
		
		Employee employee = null ;//new Employee(301, "Hari");
		
		Optional<Employee> ofNullable = Optional.ofNullable(employee);
		System.out.println(ofNullable);
		
		//get emp name 
		
		Optional<String> ename = ofNullable.map(Employee::getName);
		
		System.out.println(ename);//Optional[Employee [id=301, name=Hari]]
		
		Optional<Integer> eid = ofNullable.map(Employee::getId);//Optional[Hari]
		System.out.println(eid);//Optional[301]
		
		Optional<String> lamdaName = ofNullable.map(i->i.getName().toUpperCase());//Optional[HARI]
		System.out.println(lamdaName);
		

		
		
	}
}
