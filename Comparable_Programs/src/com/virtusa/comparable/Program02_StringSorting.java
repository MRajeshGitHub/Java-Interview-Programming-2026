package com.virtusa.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02_StringSorting {

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<>();
		
		names.add("Rajesh");
		names.add("Ajay");
		names.add("Shubham");
		names.add("Praksh");
		names.add("Ravi");
		
		System.out.println("Before Sort..");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("After Sort..");
		System.out.println(names);
		
		//using java 8 sorting

		names.stream().sorted().toList();
		System.out.println(names);
		
		names.stream().sorted().forEach(System.out::println);
	}
}
