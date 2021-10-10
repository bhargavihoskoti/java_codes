package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="donor")
public class DonorRegistry {
	
	@Id
	@Column(name="regid")
	int regId;
	@Column(name="donorname")
	String donorName;
	@Column(name="bloodgroup")
	String bloodGroup;
	@Column(name="age")
	int age;
	@Column(name="location")
	String location;
	@Column(name="phonenumber")
	long phoneNumber;
	@Column(name="dateOfLastDonated")
	LocalDate dateOfLastDonated;
	@Column(name="dateofreg")
	LocalDate dateOfReg;
	

}
