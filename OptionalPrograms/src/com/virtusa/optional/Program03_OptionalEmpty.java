package com.virtusa.optional;

import java.util.Optional;

import com.virtusa.optional.model.Employee;

public class Program03_OptionalEmpty {

	public static void main(String[] args) {
		
		Optional<Employee> optional= Optional.empty();
		System.out.println(optional);//Optional.empty

		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);//Optional.empty
		
		Optional<Integer> nums= Optional.empty();
		System.out.println(nums);//Optional.empty
	}
}
