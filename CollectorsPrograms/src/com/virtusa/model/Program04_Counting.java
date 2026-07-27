package com.virtusa.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program04_Counting {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rajesh", "Amit", "Sunil", "Neha", "Rahul");

		Long countEle = names.stream().collect(Collectors.counting());
		System.out.println("countEle :" + countEle);

		// 2nd way of counting

		long count = names.stream().count();
		System.out.println("count is :" + count);
	}
}
