package com.virtusa.controller;

import com.virtusa.service.EmployeeService;

public class EmployeeController {

	
	public static void main(String[] args) {

        EmployeeService service =
                new EmployeeService();

        String name =
                service.getEmployeeName(102);

        System.out.println(name);

    }
}
