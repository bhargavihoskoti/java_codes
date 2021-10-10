package com.example.demo;

public class VehicleInsurance extends Insurance {
	
	private String vehicleType;

	public VehicleInsurance() {
		super();
		System.out.println("Inside sub class 0 param constructor");
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber, String policyHolder, double policyAmount, String vehicleType) {
		super(policyNumber, policyHolder, policyAmount);
		System.out.println("Inside sub class 4 Param constructor-");
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleType=" + vehicleType + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculatePremium() {
		
		double premium=100;
	
		switch(vehicleType.toLowerCase()) {
		case "car":
			if(getPolicyAmount()>50000) {
				premium=2000;
			}
			break;
		case "bike":
			if(getPolicyAmount()>50000) {
				premium=1000;
			}
			break;
			
			
		}
		return premium;
	}

	

	

	
	
	
}
