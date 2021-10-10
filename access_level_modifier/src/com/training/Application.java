package com.training;

public class Application {
	public static void main(String[] args)
	{
		Student ram=new Student();
		
		//System.out.println(ram.rollnumber); rollnumber is marked private ,hence not visible
		System.out.println(ram.studentName);
		System.out.println(ram.markScored);
		System.out.println(ram.email);
	}

}
