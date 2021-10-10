package com.training;

import com.training.ifaces.BookService;
import com.training.model.Boook;
import com.training.service.BookServiceWithStream;
import com.training.services.BookServiceImpl;

public class Application {

	public static void main(String[] args) {

		int key =4;
		
		System.out.println("Thread Name:="+Thread.currentThread().getName());
		BookService service=new BookServiceImpl();
		BookService obj=new BookServiceWithStream();
		
		try{
		switch (key) {
		case 1:
			
			Boook book=new Boook(102,"JAVA program","KathySieera",400);
			service=new BookServiceImpl();
			service.write(book);
			boolean result =service.write(book);
			if(result)
			{
				System.out.println("Added to file");
			}
			
			break;
		case 2:
			Boook[] list=service.read();
			
			for(Boook eachBook:list) {
				if(eachBook!=null) {
					System.out.println(eachBook);
				}
				
			}
			break;
			
		case 3://Serializing
			Boook jsBook=new Boook(103,"Java script","Paul",500);
		
			boolean status=	obj.write(jsBook);
		
		if(status) {
			System.out.println("One Book Serialized");
		}
		break;
		
		case 4://deSerializing
			Boook[] foundList=obj.read();
			System.out.println(foundList[0]);
			break;
		default:
			break;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
