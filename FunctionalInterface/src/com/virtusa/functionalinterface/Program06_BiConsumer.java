package com.virtusa.functionalinterface;

import java.util.function.BiConsumer;

public class Program06_BiConsumer {

	public static void main(String[] args) {

		BiConsumer<String, Integer> printData = (name, age) -> System.out.println(name + " : " + age);

		printData.accept("Rajesh", 40);// Rajesh : 40

	}

}
