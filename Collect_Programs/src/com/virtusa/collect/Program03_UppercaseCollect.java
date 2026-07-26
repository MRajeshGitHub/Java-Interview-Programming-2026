package com.virtusa.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program03_UppercaseCollect {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "mango", "orange");

		List<String> collect = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Normal List : " + fruits);// Normal List : [apple, banana, mango, orange]
		System.out.println("Upper Case  : " + collect);// Upper Case : ->[APPLE, BANANA, MANGO, ORANGE]

		// java 16

		List<String> list = fruits.stream().map(String::toUpperCase).toList();

		System.out.println("list using java 16 is : " + list);// Normal List : [apple, banana, mango, orange]
	}
}
