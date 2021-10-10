package org.training;

import com.training.Student;

public class SecondApplication {
	public static void main(String[] args)
	{
		Student ram=new Student();
		
		//System.out.println(ram.rollNumber); //rollnumber is marked private ,hence not visible
		//System.out.println(ram.studentName); //default -package, since org.training is a different package not visible
		//System.out.println(ram.markScored);//protected -since its a different package and also not
		System.out.println(ram.email);//public -its visible
	}

}
