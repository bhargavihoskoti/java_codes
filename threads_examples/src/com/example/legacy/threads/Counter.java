package com.example.legacy.threads;

public class Counter {
	
	private int countUpTo;

	public Counter(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
	}
	
	public int sumNumber() {
		int sum=0;
		for(int i=0;i<countUpTo;i++) {
			sum=sum+i;
			
		}
		return sum;
		
	}

}
