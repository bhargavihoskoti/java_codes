package com.training;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class ApplicationForSet {
	
	public static void print(String message,Set <Student> List) {
		
		System.out.println(message);
		for (Student each:List) {
			System.out.println(each);
		
	}
	}	

	public static void main(String[] args) {

		Student ram =new Student(101, 90, "ram@123", "ram");
		Student sam =new Student(102, 70, "sam@123", "sam");
		Student bam =new Student(103, 70, "bam@123", "bam");
		
		
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(sam);
		hashSet.add(ram);
		hashSet.add(bam);
		
		print("Hash Set - No duplicates- only 2 elements should be listed",hashSet);
		
		TreeSet <Student> treeSet = new TreeSet<>();
		Student bhim =new Student(104, 79, "bhim@123", "bhim");
		
		treeSet.add(ram);
		treeSet.add(sam);
		treeSet.add(bam);
		treeSet.add(bhim);
		
		print("Tree Set - No duplicates- only 3 elements should be listed",treeSet);
		
	}

}
