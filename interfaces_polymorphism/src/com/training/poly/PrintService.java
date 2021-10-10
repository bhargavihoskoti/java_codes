package com.training.poly;

import com.training.ifaces.*;

public class PrintService {
	
//	public static void print(Student obj) {
//		System.out.println(obj.test());
//	}
//	public static void print(Proffessor obj) {
//		System.out.println(obj.test());
//	}
	
	public static void print(Condition[] list) {
		//print here
		for(Condition eachElement:list) {
		System.out.println(eachElement.test());
	}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student raj=new Student(78);
		//print(raj);
		Proffessor rani = new Proffessor("phd");
		//print(rani);
		
        Student karuna=new Student(89);
		
		Proffessor mahi = new Proffessor("ms");
		
		
		
		//pass all the four as one unit =>ram,shyam,manish,vimal
		
		Condition[] list = {raj,rani,karuna,mahi};
		
		print(list);
	
	}

}
