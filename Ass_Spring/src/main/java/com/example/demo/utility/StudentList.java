package com.example.demo.utility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class StudentList {
	//Field DI with Qualifier
	//@Autowired
	//@Qualifier("mon")
//	private List<Student> list;
	
	Student stud;
	//Constructor DI with Qualifier
	public StudentList(@Qualifier("ram") Student stud) {
		super();
		this.stud= stud;
	}
	

	}
	
	


