package com.strings;

public class CountWords {

	public static void main(String[] args) {

		String name = "java is easy to learn";

		// String[] words = name.split(" ");

		String[] split = name.trim().split("\\s+");

		System.out.println(name);
		// System.out.println("Word length is : " + words.length);

		System.out.println("word length is : " + split.length);

	}
}
