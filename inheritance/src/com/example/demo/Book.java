package com.example.demo;

public class Book {
	
	private int bookNum;
	private String bookName;
	private String author;
	private double price;
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int bookNum, String bookName, String author, double price) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	//method Name should be same
	//arg and arg order should be same
	//return type should be same
	//modifier should not reduce visibility
	@Override //metadata or anutation
	public String toString() {
		
	
		return this.bookNum+":"+this.bookName+":"+this.author+":"+this.price;
	}
	
	
}
