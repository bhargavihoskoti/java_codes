package com.example.legacy.threads;

public class PrintStringTask implements Runnable {

	private String str1;
	private String str2;
	
	
	
	public PrintStringTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		//this-refers to same class because this class itself is a runnable class
		Thread thread =new Thread(this);
		thread.start();
	}



	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		PrintStrings.print(str1,str2);

	}

}
