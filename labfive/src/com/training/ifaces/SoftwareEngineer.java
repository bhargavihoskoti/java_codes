package com.training.ifaces;

public class SoftwareEngineer implements Billable {
	
	private int sal;
	
	@Override
	public double calculate(Object obj) {
		
		return sal*0.5;
	}

	public SoftwareEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareEngineer(int sal) {
		super();
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}

