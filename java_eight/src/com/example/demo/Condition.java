package com.example.demo;

@FunctionalInterface
public interface Condition {
	
	String NAME="hello";
	
	public boolean test();
	
	default String show() {
		
		return "I am from default Method";
	}
	
}
