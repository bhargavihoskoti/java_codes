package com.example.demo.utility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;



@Component
@AllArgsConstructor
@Setter
@Getter
@ToString
//@Lazy //if not this then it is eager
public class StudentList {
	
	public StudentList() {
		super();
		
		System.out.println("===== Student Service Called =====");
	}
	
	
	@Autowired
	List<Student> studentList;

	}
	
	


