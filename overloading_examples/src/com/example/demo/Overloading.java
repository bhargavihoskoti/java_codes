package com.example.demo;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram= new Student(101,"Ramesh",90,"ram@abc.com");
		
		Student shyam= new Student(101,"Shyam",60,"shyam@abc.com");
		
		StudentService service= new StudentService();
		
		System.out.println("expect => Grade O=:"+service.assignGrade(ram));
		
		System.out.println("expect => Grade A=:"+service.assignGrade(shyam,"Urban"));
	}

}
