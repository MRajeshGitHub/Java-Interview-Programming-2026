package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program04_IsPresent_IsEmpty {

	public static void main(String[] args) {
		
		
		  Employee employee = new Employee(101, "Rajesh");

	        Optional<Employee> optionalEmployee =
	                Optional.ofNullable(employee);
	        
	        System.out.println(optionalEmployee);//Optional[Employee [id=101, name=Rajesh]]

	        System.out.println(optionalEmployee.get());//Employee [id=101, name=Rajesh]
	        
	        //java 8
	        
	        System.out.println("Employee is Present : "+optionalEmployee.isPresent());//Employee is Present : true
	        
	        //java 11
	        
	        System.out.println("Employee is empty : "+optionalEmployee.isEmpty());//Employee is empty : false
	        
	        
	        System.out.println("With null values ");
	        
	        
	        Employee employee1 = null;

	        Optional<Employee> optionalEmployee1 =
	                Optional.ofNullable(employee1);

	        System.out.println("isPresent : " + optionalEmployee1.isPresent());//isPresent : false
	      

	        System.out.println("isEmpty   : " + optionalEmployee1.isEmpty());//  isEmpty   : true
	}
}
