package com.example.demo;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Logger log=Logger.getRootLogger();
      
      try(Scanner sc= new Scanner(System.in);) {
    	  
    	  log.debug("Inside try block");
    	  System.out.println("Enter the Number");
    	  
    	  double number =sc.nextDouble();
    	  
    	  log.info("Your Entered number:="+number);
    	  
    	  if(number<0) {
    		  log.error("Number should be positive integer");
        	  throw new Exception("Invlaid Number");
        	  
          }
    	  double result =Math.sqrt(number);
          
          log.info("Completed Square root:="+result);
          
          sc.close();
		
	} catch (Exception e) {
		log.debug(e.getMessage());
		e.printStackTrace();
		
	}
     
    }
}
