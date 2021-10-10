package com.training;

import com.training.model.Student;
import java.util.*;

public class ApplicationForMap {

	public static void main(String[] args) {

		Student ram =new Student(101, 90, "ram@123", "ram");
		Student sam =new Student(102, 70, "sam@123", "sam");
		Student bam =new Student(103, 70, "bam@123", "bam");
		
		HashMap<Integer,Student> list = new HashMap<>();
		
		list.put(200, ram);
		//if key is already present and is duplicate it returns previous instance data
		//if not duplicate or is unique it returns null
		Object obj2= list.put(201, sam);
		Object obj=list.put(201, bam);
		
		System.out.println(obj);
		System.out.println("object 2:"+obj2);

		System.out.println(list.get(201));
		
	}

}
