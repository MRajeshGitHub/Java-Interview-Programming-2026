package com.virtusa.comparable.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program01_IntegerSorting {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		
		list.add(90);
		list.add(10);
		list.add(80);
		list.add(40);
		list.add(20);

		System.out.println("Before sort");
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println("sort sort");
		System.out.println(list);
		
		System.out.println("sort using java 8");
		
		list.stream().sorted().toList();
		System.out.println(list);
		
	}
}
