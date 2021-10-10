package com.example.demo;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Command line Argument values are passed => 
		//Run As, Run Configuration
		//Select Arguments tab and enter the values
		int rollNumber =Integer.parseInt(args[0]);
		String studentName=args[1];
		double markScored =Double.parseDouble(args[2]);
		String email =args[3];
		
		Student ram = new Student(rollNumber,studentName,markScored,email);
		
		System.out.println(ram.getStudentName());
		System.out.println(ram.getRollNumber());
		System.out.println(ram.getMarkScored());
		System.out.println(ram.getEmail());
		
		//Transforming integer representation into String using Integer.toString()
		int phoneNumber=283292245;
		
		String strPhoneNumber= Integer.toString(phoneNumber);
		//Using the String class length method to find the length
		System.out.println("Phone Number Length:="+strPhoneNumber.length());
	}

}
