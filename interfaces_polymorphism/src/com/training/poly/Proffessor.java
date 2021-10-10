package com.training.poly;

import com.training.ifaces.Condition;
import java.io.Serializable;

public class Proffessor extends Person implements Condition ,Serializable{
	
	private String qualification;
	
	
	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public Proffessor(String qualification) {
		super();
		this.qualification = qualification;
	}


	public Proffessor() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.toLowerCase().equals("phd");
	}

}
