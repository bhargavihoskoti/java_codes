package com.executor.legacy.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import com.example.legacy.threads.PrintStringTask;

public class Application {

	public static void main(String[] args) {
		
	Runnable task1=	new PrintStringTask("Idly","Sambhar");
	Runnable task2=new PrintStringTask("Pizza","Coke");
	Runnable task3=new PrintStringTask("Noddles","Mojito");
	Runnable task4=new PrintStringTask("Puri","Bhaji");
	
	Runnable[] taskList = {task1,task2,task3,task4};
	
	ExecutorService service= Executors.newSingleThreadExecutor();

	//ExecutorService service= Executors.newFixedThreadPool(4);

	for(Runnable eachTask : taskList) {
		service.submit(eachTask);
	}
	service.shutdown();
	}

}
