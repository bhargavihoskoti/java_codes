package com.executor.legacy.threads;

public class PrintStringTask implements Runnable {

	private String str1;
	private String str2;
	
	
	
	public PrintStringTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		/*
		 * The following lines are commented out because we are planning
		 * to use executor framework
		 * In executor frame thread pools are created and we
		 * only need to submit the task and not create threads
		 */
		
//		Thread thread =new Thread(this);
//		thread.start();
	}



	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		PrintStrings.print(str1,str2);

	}

}
