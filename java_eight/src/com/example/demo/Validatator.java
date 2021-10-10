package com.example.demo;

public interface Validatator {
	
	public boolean validate();
	
	public default String show() {
		
		return "From Validatator";
	}

}
