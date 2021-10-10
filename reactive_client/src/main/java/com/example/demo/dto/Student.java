package com.example.demo.dto;

import java.time.LocalDate;


import lombok.Data;

@Data
public class Student {
	
	int rollNumber;
	String studentName;
	LocalDate dateOfBirth;
	double markScored;
	
}