package com.example.demo;

import java.util.function.Predicate;

class Example implements Runnable{

	@Override
	public void run() {

		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
}

public class UsingLambda {

	public static void main(String[] args) {
		
		//written as a lambda
		Runnable task= ()->  {
			
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		Thread thread=new Thread(task);
		thread.start();
		
		//Implementation of test method
		Condition passMark=() -> "ramesh".length()>10;
		
		System.out.println(passMark.test());
		
		System.out.println(passMark.show());
		
		Predicate<Integer> isPassMark= (mark) -> mark>60;
		
		System.out.println("Pass -Status:="+ isPassMark.test(70));
	}
	
	

}
