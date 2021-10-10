package com.example.demo;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import com.training.Student;
public class Application {
	
	public static void main(String[] args) {
		
		//Logger log= Logger.getAnonymousLogger();
		//log.info("ram.getMarkScored());
		//to remove the warning
		
		MyExceptionHandler handler = new MyExceptionHandler();
		
		try(Scanner sc=new Scanner(System.in);) {
	
		System.out.println("Enter the choice");
		
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			handler.usingClassCastException();
			break;
		case 2:
			handler.usingMultiCatch("234");
			break;
		case 3:
			handler.tryWithMultipleCatch();
			break;
		case 4:
			handler.usingFinallyBlock();
			break;
		case 5:
			Student ram=new Student();
			ram.setMarkScored(89);
			System.out.println(ram.getMarkScored());
			break;
		case 6:
			Student shyam= new Student(202,"Shayam",178,"Shyam@abc.com");
			System.out.println(shyam);
			break;

		default:
			break;
		}
		
		} catch (InputMismatchException | RangeCheckException e) {
			
			e.printStackTrace();
		}
		
		//handler.usingClassCastException();
		
		//handler.usingMultiCatch("234");
		
	}

}
