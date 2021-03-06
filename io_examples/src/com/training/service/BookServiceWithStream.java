package com.training.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.ifaces.BookService;
import com.training.model.Boook;

public class BookServiceWithStream implements BookService {

	@Override
	public boolean write(Boook book) throws IOException {

		boolean result= false;
		
		try(ObjectOutputStream outStream =new ObjectOutputStream(
				new FileOutputStream(
						new File("book.ser")))){
			outStream.writeObject(book);
			result=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boook[] read() throws IOException {
		
		Boook[] bookList=new Boook[2];
		int pos=0;
		try(ObjectInputStream inputStream =new ObjectInputStream(
				new FileInputStream(
						new File("book.ser"))))
		{
		Boook bk=(Boook)inputStream.readObject();
				bookList[pos]=bk;
	}catch(ClassNotFoundException e)
	{
		e.printStackTrace();
		
	}
		return bookList;
}
}
