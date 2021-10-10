package com.example.demo;

public class Customer {	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Customer(String type) {
		super();
		this.type = type;
	}

	private String type;
	
	public Customer() {
		super();
	}

}