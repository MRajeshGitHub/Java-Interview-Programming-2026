package com.virtusa.flatmapOptional;

import java.util.Optional;

public class Program06_OptionalFlatMap {

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Rajesh", new Address("Hyderabad"));

		String city = Optional.of(employee)

				.flatMap(Employee::getAddress)

				.map(Address::getCity)

				.orElse("City Not Available");

		System.out.println(city);
	}
}
