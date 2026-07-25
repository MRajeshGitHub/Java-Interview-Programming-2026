package com.virtusa.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program02_SetCollect {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Mango", "Banana", "Orange");

		// print using set with collect and collectors
		Set<String> collect = fruits.stream().collect(Collectors.toSet());
		System.out.println(collect);// [Apple, Mango, Orange, Banana]
		
		//Uppercase + Set
		
		Set<String> collect3 = fruits.stream().map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println(collect3);//[APPLE, MANGO, BANANA, ORANGE]
		
	
		
		

		// Even Number check using set

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 92, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15);

		// using set to remove duplicates
		Set<Integer> collect2 = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());

		System.out.println(collect2);// [2, 4, 6, 8, 92, 12, 14]

		// using java 16

		List<Integer> list = nums.stream().filter(i -> i % 2 == 0).toList();
		System.out.println(nums);
		
		

	}
}
