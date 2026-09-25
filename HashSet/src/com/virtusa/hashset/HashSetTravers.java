package com.virtusa.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTravers {

	public static void main(String[] args) {

		Set<Employee> empSet = new HashSet<>();

		empSet.add(new Employee(101, "Rahul", "IT", 50000));

		empSet.add(new Employee(102, "Amit", "HR", 60000));

		empSet.add(new Employee(103, "Priya", "Finance", 70000));

		System.out.println(empSet.size());

		empSet.forEach(System.out::println);

		System.out.println(empSet.isEmpty());

		Iterator<Employee> iterator = empSet.iterator();

		while (iterator.hasNext()) {
			Employee next = iterator.next();
			System.out.println(next);
		}

		empSet.clear();
		System.out.println(empSet);
	}
}
