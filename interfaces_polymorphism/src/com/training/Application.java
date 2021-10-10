package com.training;

import com.training.ifaces.IFunction;

public class Application {
	
	public static void print(IFunction func,double arg) {
		
		System.out.println(func.apply(arg));
	}
	public static void main(String[] args) {
		IFunction inrToUsd=new CurrencyConverter();
		
		//System.out.println("expected:7000: Actual:="+inrToUsd.apply(100));
		print(inrToUsd,100);
		
		IFunction farToCal = new TempCoverter();
		
		//System.out.println("expected:1.11: Actual:="+farToCal.apply(34));
	  print(farToCal,34);
	}
}
