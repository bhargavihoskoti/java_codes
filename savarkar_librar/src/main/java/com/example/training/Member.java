package com.example.training;

public class Member {
	private int id;
	private String bookname;
	private String authorname;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int id, String bookname, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}
	
	

}
