package com.example.demo;

import com.example.demo.utils.DbConnection;
import com.training.daos.EmployeeDaoImpl;
import com.training.daos.EmployeeDaoImpl;
import com.training.entity.Employee;
import com.training.entity.Employee;
import java.util.*;
import java.util.Date;

import org.apache.log4j.Logger;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		Connection con = DbConnection.getOracleConnection();
		
		  Logger log=Logger.getRootLogger();
	      
		
		EmployeeDaoImpl repo = new EmployeeDaoImpl(con);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("****Key=1 : To Insert the Record****");
		System.out.println("****Key=2 : To Select All the Record****");
		System.out.println("****Key=3 : TO Select Record by First Name****");
		System.out.println("****Key=4 : To Select Record by Date of Birth****");
		System.out.println("****Key=5 : To Select Record by Annivarsary ****");
		System.out.println("****Key=6 : TO Delete Record by First Name****");
		System.out.println("****Key=7 : TO Update Record by Id****");
		System.out.println("Enter the Key value:");
		int key = scanner.nextInt();
		
		if (key == 1) {

			boolean result = repo.add();
			if (result) {
				System.out.println("One Employee Added");
			}

		}

		if (key == 2) {
			List<Employee> list = repo.findAll();

			for (Employee eachEmployee : list) {
				log.info(eachEmployee);
			}
		}
		if (key == 3) {
			List<Employee> list1 = repo.findByName();

			for (Employee eachEmployee : list1) {
				log.info(eachEmployee);
			}
		}
		if (key == 4) {
			List<Employee> list2 = repo.findByDob();

			for (Employee eachEmployee : list2) {
				log.info(eachEmployee);
			}
		}
		if (key == 5) {
			List<Employee> list3 = repo.findByAnvDate();

			for (Employee eachEmployee : list3) {
				log.info(eachEmployee);
			}
		}
		
		

		if (key == 6) {
			boolean result = repo.deleteByFname();
			if (result) {
				System.out.println("One Employee deleted");
			}

		}
		if (key == 7) {
			boolean result = repo.updateById();
			if (result) {
				System.out.println("One Employee data updated");
			}

		}
		scanner.close();
	}
		}
