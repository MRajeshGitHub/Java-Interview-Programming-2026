package com.strings;

public class StringBuilderConversion {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Java");

		// 1. append
		builder.append(" Spring");

		System.out.println("After append : " + builder);

		// 2. insert
		builder.insert(11, "Boot ");

		System.out.println("After insert : " + builder);

		// 3. setCharAt
		builder.setCharAt(0, 'K');

		System.out.println("After setCharAt : " + builder);

		// 4. delete
		builder.delete(5, 12);

		System.out.println("After delete : " + builder);

		// 5. reverse
		builder.reverse();

		System.out.println("After reverse : " + builder);

		// 6. String conversion
		String result = builder.toString();

		System.out.println("Final String : " + result);
	}
}
