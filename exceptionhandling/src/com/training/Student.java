package com.training;

import com.example.demo.RangeCheckException;

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
		
		try {
			if(markScored >0 && markScored <=100) {
				this.markScored = markScored;
				}
				else {
					throw new RangeCheckException("Invalid mark entered should be [0-100]");
				}
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		
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
	
	
	public void setMarkScored(double markScored) throws RangeCheckException {
		if(markScored >0 && markScored <=100) {
		this.markScored = markScored;
		}
		else {
			throw new RangeCheckException("Invalid mark entered should be [0-100]");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ ", email=" + email + "]";
	}
	

}
