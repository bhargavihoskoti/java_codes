package com.training.ifaces;


public class Advocate implements Billable {
	
	private int sal;
	
	public Advocate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Advocate(int sal) {
		super();
		this.sal = sal;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public double calculate(Object obj) {
	return sal*0.25;	
	}
	


	

}
