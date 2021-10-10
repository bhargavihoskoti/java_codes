package com.excersie;


public class CreditCardService {
	
	private CreditCard[] creditList;
	
	private static int maxSize=3;
	private static int count=0;
	
	public CreditCardService(CreditCard[] creditList) {
		super();
		this.creditList=creditList;
	}
	
	
	public CreditCardService() {
		super();
		this.creditList=new CreditCard[maxSize];
	}
	
	public boolean addCreditCard(CreditCard creditcard) {
	this.creditList[count]=creditcard;
	count++;
	return true;
	}
public CreditCard[] getCreditList() {
		
		return this.creditList;
	}
	
	
	

}
