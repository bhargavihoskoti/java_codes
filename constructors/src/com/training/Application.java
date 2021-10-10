package com.training;

public class Application {
	public static void main(String[] args) {
		
		Student ram=new Student();
		
		ram.setRollNumber(202);
		ram.setStudentName("Ramesh");
		ram.setMarkScored(98);
		ram.setEmail("ra,@abc.com");
		
		System.out.println(ram.getMarkScored());
		
		Student shyam =new Student(203,"Shyam",97,"shyam@abc.com");
		
		System.out.println(shyam.getStudentName());
		System.out.println(shyam.getMarkScored());
	
	}

}
