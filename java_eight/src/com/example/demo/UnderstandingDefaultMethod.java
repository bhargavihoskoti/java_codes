package com.example.demo;

public class UnderstandingDefaultMethod implements Condition, Validatator {

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}
	
//	@Override
//	public String show() {
//		
//		return "This from class";
//		
//	}
	
	@Override
	public String show() {
		
		return Validatator.super.show()+ Condition.super.show()+"This from class";
		
	}


}
