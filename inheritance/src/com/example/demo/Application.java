package com.example.demo;

public class Application {
	
	Object obj;

	public static void main(String[] args) {
		
//		Book RefJava= new Book(101,"Java Reference","Kathy",500);
//		
//		System.out.println(RefJava);
		
		Insurance lifeIn =new Insurance(100,"Ramesh",200000);
		
		System.out.println("Expected:10000=> Actual:="+lifeIn.calculatePremium());
		
		VehicleInsurance vInsurance= new VehicleInsurance(101,"Ram",60000,"bike");
		
		System.out.println("Expected:1000=>Actual:="+vInsurance.calculatePremium());;

	}

}
