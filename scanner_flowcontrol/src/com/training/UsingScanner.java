package com.training;

import java.util.Scanner;

public class UsingScanner {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Roll Number");
		
		int rollNumber= scanner.nextInt();
		
		System.out.println("Enter the Name");
		
		String studentName =scanner.next();
		
		System.out.println("Enter the Mark Scored");
		
		double markScored= scanner.nextDouble();
		
		System.out.println("Enter the Email");
		
		String email=scanner.next();
	
		Student obj=new Student(rollNumber, studentName,markScored,email);
		
		System.out.println(obj.getStudentName() + obj.getMarkScored() );
		
		scanner.close();
		
	}

}
