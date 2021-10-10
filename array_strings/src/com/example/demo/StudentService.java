package com.example.demo;

public class StudentService {
	
	private Student[] studList;//array declaration
	
	private static int maxSize=3;//variable to give size for array
	private static int count=0;//index position
	
	public StudentService(Student[] studList) {
		super();
		this.studList = studList;//initialization
	}
	public StudentService() {
		super();
		//Create and declaring size of array
		this.studList = new Student[maxSize];
	}
	
	public boolean addStudent(Student student) {
		//adding the element
		//create a if condition-if condition is met you add the element other wise return a
		//boolean false and also a message array size full.
		if(count==maxSize)
		{
			System.out.println("size full");
			return false;
			
			
		}
		else {
			this.studList[count]=student;
			count++;
			return true;
		}
	}
	
	public Student[] getStudList() {
		
		return this.studList;
	}
	
	
	

}
