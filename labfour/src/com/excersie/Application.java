package com.excersie;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard ram=new CreditCard(101,"Ramu reddy");
		CreditCard raj=new CreditCard(102,"Raj sharma");
		CreditCard rakesh=new CreditCard(103,"Rakesh reddy");
		
		CreditCardService service= new CreditCardService();
		
		service.addCreditCard(ram);
		service.addCreditCard(raj);
		service.addCreditCard(rakesh);
		
		CreditCard[] list= service.getCreditList();
		
		int rcount=0;
		int scount=0;
		
		
		
		for(CreditCard takecard:list)
		{
			String name=takecard.getCardHolderName();
			
			if(name.contains("reddy"))
			{
			rcount++;
			}
			else if(name.contains("sharma"))
			{
				scount++;
			}
			else {
				System.out.println("None");
			}
			System.out.println(takecard);
			

		}
		System.out.println("Reddy Count:"+rcount);
		System.out.println("Sharma Count:"+scount);
		
	}
	}
