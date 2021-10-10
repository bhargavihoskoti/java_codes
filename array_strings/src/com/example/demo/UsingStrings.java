package com.example.demo;
/*
 * substr,length,trim,uppercase,lowercase,indexof,charAt
 */

public class UsingStrings {

	public static void main(String[] args) {
		
		String city="Koppal";
		
		String firstName="BHARGAVI";
		
		String lastName="hoskoti";
		
		String college=" Gogte Institute of Technology ";
		
		System.out.println("Length of the string:="+city.length());
		System.out.println("Transform to upper case:="+lastName.toUpperCase());
		System.out.println("Substring:="+city.substring(3,6));
		System.out.println("College:="+college.length());
		System.out.println("Trim:="+college.trim().length());
		
		System.out.println("Character at postion 2 in college:"+college.charAt(1));
		System.out.println("Index of character h in college:"+college.indexOf("t"));

	}

}
