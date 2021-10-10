package com.example.demo;

public class MyExceptionHandler {
	
	//Example for Unchecked Exception => Runtime Exception
	//All Classes that extends Runtime Exception are unchecked
	
	public void usingClassCastException() {
		//Object ageObj="twenty";
		
		Object ageObj= Integer.valueOf(20);
		
		
		try {
			Integer age =(Integer)ageObj;
			age = (Integer)ageObj;
			
		} catch (ClassCastException e) {
			System.err.println("ageObj ahould be a number[0-9]");
			e.printStackTrace();
		}	
		
	}
	public void usingMultiCatch(String strNumber) {
		String[] value= {"ram","ravi"};
		
		String city=null;
		try {
			int num=Integer.parseInt(strNumber);
			System.out.println(city.length());
			System.out.println(num);
			System.out.println(value[2]);
			
		} catch (NumberFormatException e) {
			
			System.err.println("Argument should be a number[0-9]");
			
			e.printStackTrace();
		}catch(NullPointerException e) {
			
			System.err.println("Argument should not be NULL");
			
		}catch(Exception e) {
			
			System.out.println("Handler All other Exception");
			e.printStackTrace();
		}
	}
	public void tryWithMultipleCatch() {
		
		try {
			int numerator=20;
			int[] denominators= {10,0};
			
			System.out.println(numerator/denominators[1]);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) 
		{
		e.printStackTrace();
		
	}
	}
	public void usingFinallyBlock() {
		try {
			int numerator=20;
			int[] denominators= {10,0};
			
			System.out.println(numerator/denominators[0]);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) 
		{
		e.printStackTrace();
		}finally {
			System.out.println("Inside finally Block");
		}
		
	}
	
	
}
