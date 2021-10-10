package com.training.poly;

import com.training.ifaces.Condition;

/*
 * marker interface => interface that does not have any method
 * functional interface => interface that has just one abstract method
 * interface => with more than one abstract methods
 * Serializable is a marker interface
 */

public class Student extends Person implements Condition {
	
	private int markScored;
	
	
	
	public int getMarkScored() {
		return markScored;
	}



	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}



	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.markScored >80;
	}
	

}
