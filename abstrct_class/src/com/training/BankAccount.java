package com.training;

public abstract class BankAccount {
	
	private long accNumber;
	private double balance;
	
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	
	public BankAccount(long accNumber, double balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", balance=" + balance + "]";
	}
    
	
	

}
