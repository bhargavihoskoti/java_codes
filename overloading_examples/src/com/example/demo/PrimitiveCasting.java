package com.example.demo;
//Casting primitives
//Wrapper class
//auto-boxing
//method overloading

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=23;
		//here casting is not required => because int => long upcasting
		long maxAge=age;
		
		long salarayPerMonth=55000;
		
		//int salary= salarayPerMonth;
		
		//Casting Long to int => down casting
		int salary= (int)salarayPerMonth;
		
		System.out.println(salary);
	
		
	}

}
