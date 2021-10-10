package com.example.demo;

public class Application {
	public static void print(CreditCard card) {
		System.out.println(card.getCardHolderName());
		System.out.println(card.getCardNumber());
		System.out.println(CreditCard.getCardProvider());
		/*
		 * static method should be accessed with class name=> ClassName.method()
		 * static method should NOT accessed with obj.method(); if its done complier throws a warning
		 */
		//System.out.println(card.getCardProvider());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card= new CreditCard(1010,"Gouri");
		
		//Application.print(card);
		//print(card); 
		//Since print is a static method of the same class it can be invoked even without using ClassName.but it could be called with ClassName also.
		LocalAndParameterExample obj=new LocalAndParameterExample();
		
		obj.usingLocalVariable();
		/*
		 * Expected output is 0 because instance variable has default value
		 * default value for integer is 0
		 */
		obj.usingInstanceVariable();
		
		System.out.println(card.getCardHolderName());
		//When you are passing objects its copy of reference is passed
		//so changes made to the object inside the method will get reflected here also
		obj.usingParameterVariable(card);
		System.out.println(card.getCardHolderName());
    
		int num=89;
        System.out.println("Number:="+num);
        obj.usingPrimitive(num);
        System.out.println("Number Again:="+num);

	}

}
