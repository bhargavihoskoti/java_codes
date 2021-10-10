package com.executor.legacy.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	
	private String message;
	
	public MyCallable(String message) {
		super();
		this.message=message;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello -" + message;
		//int count=0;
//		for (int i=0;i<=10;i++) {
//			//count+=i;
//		}
//		//return count;
	}
}	
	
	


