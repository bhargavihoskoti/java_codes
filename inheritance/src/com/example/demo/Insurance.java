package com.example.demo;

public class Insurance {
	
	private int policyNumber;
	private String policyHolder;
	private double policyAmount;
	
   public Insurance(int policyNumber, String policyHolder, double policyAmount) {
		
		super();
		System.out.println("Inside Super class 3 Param Constructor");
		this.policyNumber = policyNumber;
		this.policyHolder = policyHolder;
		this.policyAmount = policyAmount;
		
	}
	public Insurance() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolder=" + policyHolder + ", policyAmount="
				+ policyAmount + "]";
	}
	
	public double calculatePremium() {
		double premium=5000;
		
		if(this.policyAmount>100000) {
			premium =10000;
		}
		return premium;
	}
	
	

}
