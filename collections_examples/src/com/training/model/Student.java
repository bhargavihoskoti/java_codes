package com.training.model;

import java.util.Objects;

//modifier class class_name
public class Student implements Comparable<Student>{
	//attr modifier type name = initial_value
	private int rollNumber;
	private double markScored; // protected - inheritence(avliable to diff packages only if subclass of it)
	private String email;
	private String studentname; //package (not avaliable to different packages)
	
	public Student() {
		super();
	}
	public Student(int rollNumber, double markScored, String email, String studentname) {
		super();
		this.rollNumber = rollNumber;
		this.markScored = markScored;
		this.email = email;
		this.studentname = studentname;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, markScored, rollNumber, studentname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber && Objects.equals(studentname, other.studentname);
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.rollNumber > o.rollNumber) return 1;
		if (this.rollNumber < o.rollNumber) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", markScored=" + markScored + ", email=" + email
				+ ", studentname=" + studentname + "]";
	}
	
	
	
	
	

	
}
