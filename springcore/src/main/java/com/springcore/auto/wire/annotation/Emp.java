package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	// @Autowired
	private Address address; // autowiring over property

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;

	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired // autowiring over constructor
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor autowiring");

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
