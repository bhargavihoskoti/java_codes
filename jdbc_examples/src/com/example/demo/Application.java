package com.example.demo;

import com.example.demo.utils.DbConnection;
import com.training.daos.StudentDaoImpl;
import com.training.entity.Student;
import com.training.ifaces.CrudRepository;


import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Connection con=DbConnection.getOracleConnection();
		
		CrudRepository<Student> repo=new StudentDaoImpl(con);
		int key=2;
		
		if(key==1) {
		
		Student jan=new Student(105,"Janvi",LocalDate.of(1999, 6, 28),59);
		
		boolean result =repo.add(jan);
		if(result) {
			System.out.println("One Student Added");
		}
		
	
	}
		
		if(key==2) {
			List<Student> list =repo.findAll();
			
			for(Student eachStudent :list){
				System.out.println(eachStudent);
			}
		}

	}
}
	
