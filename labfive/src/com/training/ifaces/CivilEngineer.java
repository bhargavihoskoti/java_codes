package com.training.ifaces;

public class CivilEngineer implements Billable {
	
	private int sal;
	
	@Override
	public double calculate(Object obj) {
		
		return sal*0.35;
	}

	public CivilEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CivilEngineer(int sal) {
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
