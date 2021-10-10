package com.training;

public class UsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String time="afternoon";
		
		//Switch case with string available from java 7 onwards
		
		switch(time) {
		case "morning":
			System.out.println("Good Morning");
			break;
		case "afternoon":
			System.out.println("Good Afternoon");
			break;
		case "evening":
			System.out.println("Good Eveining");
		default:
			System.out.println("Hi");
		}
	}

}
