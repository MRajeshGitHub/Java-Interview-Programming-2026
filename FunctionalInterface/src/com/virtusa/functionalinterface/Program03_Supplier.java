package com.virtusa.functionalinterface;

import java.util.function.Supplier;

public class Program03_Supplier {

	public static void main(String[] args) {
		Supplier<String> message = () -> "Hello Rajesh";

		String result = message.get();

		System.out.println(result);// Hello Rajesh

	}

}
