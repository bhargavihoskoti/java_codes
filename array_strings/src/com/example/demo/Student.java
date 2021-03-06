package com.example.demo;
//Data Hiding
//Provide Interface -> set/Get to access the variables
public class Student {
	private int rollNumber;
	private String studentName;
	private double markScored;
	private String email;

public Student() {
	super();
}
	public Student(int rollNumber, String studentName, double markScored, String email) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
		this.email = email;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		if(markScored >0 && markScored <=100) {
		this.markScored = markScored;
		}
		else {
			System.out.println("Invalid mark entered should be [0-100]");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
