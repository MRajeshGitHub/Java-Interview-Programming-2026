package com.virtusa.flatmapOptional;

import java.util.Optional;

public class Employee {

	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// call method
	public Optional<Address> getAddress() {
		return Optional.ofNullable(address);
	}

}
