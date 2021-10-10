package com.example.demo;

public class StudentService {
	
	public String assignGrade(Student student) {
		
		String grade="A";
		
		if(student.getMarkScored()>80)
		{
			grade="O";
		}
		return grade;
	}
	//overloaded method with 2 argument -One student and another one is string
	public String assignGrade(Student student, String category) {
		
		String grade="A";
		
		if(category.equals("Urban")) {
			
			if(student.getMarkScored()>80)
			{
				grade="O";
			}
		}
		else {
			
			if(student.getMarkScored()>70)
			{
				grade="O";
			}
		}
		return grade;
	}
}
