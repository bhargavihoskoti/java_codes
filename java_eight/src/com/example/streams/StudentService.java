package com.example.streams;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.example.demo.Student;

import java.util.function.*;
public class StudentService {
	
	private List<Student> studentList;
	
	public StudentService() {
		super();
		
		this.studentList=new ArrayList<>();
	
	
	
	this.studentList.add(new Student(201,"Aman",LocalDate.of(1997,5,2),79));
	this.studentList.add(new Student(202,"Lakshman",LocalDate.of(1998,11,9),89));
	this.studentList.add(new Student(203,"Gouri",LocalDate.of(1997,3,6),98));
	this.studentList.add(new Student(204,"Zayn",LocalDate.of(1998,1,12),45));
	this.studentList.add(new Student(205,"Sarala",LocalDate.of(1997,3,24),67));
	
	}


  public List<Student> useFilter(){
	
	return this.studentList.stream()
			.filter(e->e.getMarkScored()>70)
			.collect(Collectors.toList());
	
}

   public List<Student> useFilter(Predicate<Student> predicate){
	
	return this.studentList.stream()
			.filter(predicate)
			.collect(Collectors.toList());
	
}
   public Map<String,Double> transformToMap(){
	
	return this.studentList.stream()
			.filter(e->e.getMarkScored()>70)
			.collect(Collectors.toMap(Student::getStudentName,Student::getMarkScored));
}

   public List<String> getStudentNames(){
	
	return this.studentList.stream()
			.filter(e->e.getMarkScored()>70)
			.map(e->e.getStudentName())
			.collect(Collectors.toList());
}
   
   public Set<Student> sortedByName(){
	   
	  TreeSet<Student> list= this.studentList.stream().sorted()
	   .collect(Collectors.toCollection(TreeSet::new));
	  
	  List<Student> list2=this.studentList.stream()
			  .sorted(Comparator.comparing(Student::getMarkScored)).collect(Collectors.toList());
	  
	  list2.forEach(e->System.out.println(e.getStudentName()));
//	    list.forEach(e-> System.out.println(e.getStudentName()));
//	 
//	    return this.studentList.stream()
//			   .sorted(Comparator.comparing(Student::getStudentName))
//			   .collect(Collectors.toList());
	  
	  return list;
   }
   
   public double highestMark() {
	   
//	   Optional<Double> value2=this.studentList
//			   .stream().map(e->e.getMarkScored())
//			   .max(Comparator.comparing(Double::doubleValue));
	   
	   Optional<Student> value=this.studentList.stream()
			   .max(Comparator.comparing(Student::getMarkScored));
	   
	   double max=0;
	   if(value.isPresent()) {
		   max=value.get().getMarkScored();
	   }
	   return max;
   }
}

