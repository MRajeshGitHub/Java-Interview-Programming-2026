package com.virtusa.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program01_ListCollect {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");

		// Print with collect
		List<String> list = fruits.stream().collect(Collectors.toList());
		System.out.println(list);// [Apple, Banana, Mango, Orange]

		// Using Filter
		List<String> listwithA = fruits.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());
		System.out.println(listwithA);// [Apple]

		// Using Map apply all list into Uppar-case

		List<String> listwithmap = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(listwithmap);// [APPLE, BANANA, MANGO, ORANGE]

		// addting element in the list

		// Using java 16

		List<String> newList = fruits.stream().toList();
		System.out.println(newList);

		List<String> list2 = fruits.stream().map(String::toUpperCase).toList();
		System.out.println(list2);

		//Add new element in old list
		List<String> list3=new ArrayList<>(newList);
		list3.add("Goava");
		System.out.println(list3);
				
				
	}

}
