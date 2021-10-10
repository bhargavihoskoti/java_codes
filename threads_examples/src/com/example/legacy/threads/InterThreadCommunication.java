package com.example.legacy.threads;

class DepositTask implements Runnable{
	
	BankAccount account;

	public DepositTask(BankAccount account) {
		super();
		this.account = account;
		Thread t1=new Thread(this);
		t1.start();
		
	}

	@Override
	public void run() {
		
		System.out.println("Balance after deposit:="+account.deposit(4000));
	}
}
class WithdrawTask implements Runnable{
	BankAccount account;
	
	public WithdrawTask(BankAccount account) {
		super();
		this.account=account;
		Thread t2=new Thread(this);
				t2.start();
		
	}
	
		

@Override
	public void run() {
		System.out.println("Balance after withdrawl:="+account.withdraw(1500));
		
	}
}


public class InterThreadCommunication {


public static void main(String[] args) {
		BankAccount account=new BankAccount();
		
		new WithdrawTask(account);
		
		new DepositTask(account);
			}
		
}
	
	


