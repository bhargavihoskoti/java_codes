package com.training;
/*
 * equals
 * switch case
 * do while
 * while
 * for loop
 */

public class UsingIf_Else {
	
	public static void main(String[] args) {
		
		int mark=56;
		
		System.out.println(mark>60);
		//if(boolean_expression){} here mark>60 evaluates to either true or false
		if(mark>60) {
			System.out.println("Good Mark");
		}
		String message1="Hello World";
		String message2="Hello Koppal";
		
		System.out.println("Messages are same with ==:="+ (message1==message2));
		System.out.println("Messages are same with equals:="+message1.equals(message2));
		
		String message3= "Hello";
		String message4= message3;
		
		System.out.println("Messages are same with =="+(message3==message4));
		System.out.println("Messages are same with equals:="+message3.equals(message4));
		
		String message5= new String("Hello");
		String message6= new String("Hello");
		
		System.out.println("Messages are same with ==:="+(message5==message6));
		System.out.println("Messages are same with equals:="+message5.equals(message6));
	
		Student ram1= new Student(101,"Ramesh",97,"ram@abc.com");
		Student ram2= new Student(101,"Ramesh",97,"ram@abc.com");
		
		System.out.println("Is Both are same:="+ram1.equals(ram2));
	}

}
