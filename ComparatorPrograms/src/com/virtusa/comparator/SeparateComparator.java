package com.virtusa.comparator;

import java.util.Comparator;

import com.virtusa.model.Employee;

public class SeparateComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge().compareTo(o2.getAge());
	}
}
