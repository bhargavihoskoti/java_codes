package com.example.streams;
import java.util.function.*;
import java.util.List;

import com.example.demo.Student;
import com.example.streams.StudentService;

public class StreamsApplication {
	
	public static void main(String[] args) {
		
		StudentService service =new StudentService();
		
	List<Student> markSeventyAbove=service.useFilter();
//		
//		System.out.println("Seventy marks and above");
//		
//		markSeventyAbove.forEach(System.out::println);
//		
//		Predicate<Student> lessThanSeventy =e ->e.getMarkScored()<70;
//		
//		Predicate<Student> grtThanNinty =e ->e.getMarkScored()>90;
//		
//		System.out.println("Less than Seventy");
//		
//		service.useFilter(lessThanSeventy).forEach(System.out::println);
//		
//		System.out.println("Greater than Ninety");
//		
//		service.useFilter(grtThanNinty).forEach(System.out::println);
		
	//service.getStudentNames().forEach(System.out::println);
	
	//service.transformToMap().forEach((key,value) -> System.out.println(key+":"+value));
	
	System.out.println("Highest Mark:="+service.highestMark());
	
	System.out.println("Sorted By Name");
	
	service.sortedByName().forEach(System.out::println);
	}

}
