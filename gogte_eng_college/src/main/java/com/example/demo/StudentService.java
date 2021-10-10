package com.example.demo;

import java.util.*;

public class StudentService {
	//HashMap<String,Student> details;

	HashMap<String,List<Student>> details;
 public StudentService() {
	 details=new HashMap<>();
	 
	 List<Student> beList = Arrays.asList(new Student(101,"Bhagya",90),new Student(102,"Vinod",56));
	 List<Student> mcaList =Arrays.asList(new Student(201,"Amog",89), new Student(202,"Pooja",94));
	 
	 details.put("be", mcaList);
	 details.put("mca",beList);
	 
	// details.put("be", new Student(101,"Bhagya",90));
	 //details.put("mca", new Student(102,"Ram",98));
 }
 public List<Student> findByBranch(String branch) {
	 return details.get(branch);
 }
}
