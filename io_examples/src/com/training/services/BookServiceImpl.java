package com.training.services;

import com.training.model.Boook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.training.ifaces.BookService;

public class BookServiceImpl implements BookService {
	/*
	 * The book service interface has write method with throws clause
	 * so we can override and add throws clause
	 * 
	 * But If book service interface is NOT having throws clause
	 * 
	 * the we have to override and handle IO Exception CANNOT use throws clause
	 */

	@Override
	public boolean write(Boook book) throws IOException {
		
		boolean result=false;
		try(PrintWriter writer =new PrintWriter (new FileWriter("book.txt",true))){
			
			writer.println(book.toString());
			result=true;
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boook[] read() throws IOException {
		Boook[] bookList=new Boook[3];
		try(BufferedReader reader=new BufferedReader(new FileReader("book.txt"))){
			
			String line=null;
			int pos=0;
			while((line =reader.readLine())!=null) {
				
				String[] values =line.split(",");
				
				Boook book =new Boook(Integer.parseInt(values[0]),values[1],values[2],Double.parseDouble(values[3]));
			
				bookList[pos]=book;
				pos++;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bookList;
	}

}
