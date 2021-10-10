package com.executor.legacy.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableApplication {

	public static void main(String[] args) {
	ExecutorService service= Executors.newFixedThreadPool(4);
	
	Callable task =new MyCallable("Ramesh");
	
	Future<Integer> result =service.submit(task);
	
	try {
		System.out.println(result.isDone());
		System.out.println(result.get());
		
	} catch (InterruptedException | ExecutionException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	service.shutdown();
	}

}
