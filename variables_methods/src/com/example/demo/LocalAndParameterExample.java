package com.example.demo;

public class LocalAndParameterExample {
	
	private int number;//instance variable => they have a default value
	
	private static String name="Ramesh";
	
	public void usingLocalVariable() {
		//int age; o
		/*local variable => have to be initialized before use
		 * can not use modifiers private/protected/public/default 
		 */
		int age=21;
		
		System.out.println(age);
	}
	public void usingInstanceVariable() {
		System.out.println(number);
	}
	//Passing argument => parameter variable
	public CreditCard usingParameterVariable(CreditCard card) {
		//CreditCard(object type) is the return type
		
		/*
		 * instances methods can access both static and instance variable
		 */
		System.out.println(name);
		card.setCardHolderName("Miss."+card.getCardHolderName());
		return card;
	}
	public int usingPrimitive(int num) {
		num=56;
		return num;
	}
	public static void usingInstance() {
		/*
		 * static methods can access only static variable and method 
		 */
		//System.out.println(number);
	}
}
