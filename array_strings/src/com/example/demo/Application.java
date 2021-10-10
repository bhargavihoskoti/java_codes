package com.example.demo;

public class Application {

	public static void main(String[] args) {
		Student ram= new Student(101,"Ramanath",90,"ram@abc.com");
		Student tom=new Student(102,"Tommy",89,"tom@abc.com");
		Student raj=new Student(103,"Rajesh",77,"raj@abc.com");
		Student gouri=new Student(104,"Gouri",88,"gouri@abc.com");
		
		StudentService service= new StudentService();
		
		service.addStudent(ram);
		service.addStudent(tom);
		service.addStudent(raj);
		service.addStudent(gouri);
		
		Student[] list=service.getStudList();
		
		for(Student eachStudent:list)
		//eachStudent is a variable
		{
			System.out.println(eachStudent.getStudentName());
		}

	}

}
