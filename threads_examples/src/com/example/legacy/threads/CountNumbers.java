package com.example.legacy.threads;

public class CountNumbers implements Runnable {

	private int countUpTo;
	
	Counter obj=null;
	public CountNumbers(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
	  obj=new Counter(countUpTo);
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"Sum:="+obj.sumNumber());	
	}
}
