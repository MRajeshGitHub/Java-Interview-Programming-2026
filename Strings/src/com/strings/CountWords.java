package com.strings;

public class CountWords {

	public static void main(String[] args) {

		String name = "java is easy to learn";

		String[] words = name.split(" ");

		System.out.println(name);
		System.out.println("Word length is : " + words.length);
	}
}
