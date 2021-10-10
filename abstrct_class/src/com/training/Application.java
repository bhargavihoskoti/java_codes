package com.training;

public class Application {

	public static void main(String[] args) {
		
		SavingsAccount acc=new SavingsAccount(1,1000,"Raj");
		
		acc.deposit(1000);
		acc.deposit(5000);
		
		System.out.println("expect 7000=Actual:="+acc.getBalance());
		
		acc.withdraw(2000);
		
		System.out.println("expect 5000=Actual:="+acc.getBalance());
		
		acc.withdraw(6000);
		System.out.println("Look in console for message=Actual:="+acc.getBalance());
		
		System.out.println(acc.showGreeting());
		
		//SavingsAccount acc=new SavingsAccount(1,1000,"Raj");
		
		BankAccount parent =new SavingsAccount(2,2000,"Komal");
		
		//System.out.println(parent.showGreeting());
		
		//casting parent into child type
		System.out.println(((SavingsAccount)parent).showGreeting());
	}

}
