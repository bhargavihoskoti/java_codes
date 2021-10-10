package com.example.legacy.threads;

public class TaskForJoin implements Runnable {

	@Override
	public void run() {
		System.out.println("Start Reading");
		
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finished Reading");

	}

}

