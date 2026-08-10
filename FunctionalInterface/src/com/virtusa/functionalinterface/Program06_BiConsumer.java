package com.virtusa.functionalinterface;

import java.util.Map;
import java.util.function.BiConsumer;

public class Program06_BiConsumer {

	public static void main(String[] args) {

		BiConsumer<String, Integer> printData = (name, age) -> System.out.println(name + " : " + age);

		printData.accept("Rajesh", 40);// Rajesh : 40
		//

		// Map.forEach()

		Map<String, Integer> employees = Map.of("Rajesh", 60000, "Rahul", 45000, "Amit", 70000);

		employees.forEach((name, sal) -> {
			System.out.println(name + "-----" + sal);
		});

	}

}
