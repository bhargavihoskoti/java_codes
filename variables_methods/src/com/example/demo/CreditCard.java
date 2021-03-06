package com.example.demo;
/**
 * 
 * @author Bhargavi
 *@version 1.0
 *Example to understand Instance, Class Variables and Methods
 */

public class CreditCard {
	private long cardNumber; //instance variable
	private String cardHolderName;//instance variable
	private static String cardProvider="visa";//class variable
	public CreditCard() {
		super();
	}
	/*
	 * card provider is not added to constructor because its a static variable
	 * static variables are shared
	 */
	
	public CreditCard(long cardNumber, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public static String getCardProvider() {
		return cardProvider;
	}

	public static void setCardProvider(String cardProvider) {
		CreditCard.cardProvider = cardProvider;
	}
	
	

}
