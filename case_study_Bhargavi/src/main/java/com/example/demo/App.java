package com.example.demo;

import com.example.demo.utils.DbConnection;
import com.training.daos.EmployeeDaoImpl;
import com.training.daos.EmployeeDaoImpl;
import com.training.entity.Employee;
//import com.training.exception.NameNotFoundException;
import com.training.entity.Employee;
import java.util.*;
import java.util.Date;

import javax.naming.NameNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.ThrowableRendererSupport;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) throws NameNotFoundException {
		Connection con = DbConnection.getOracleConnection();

		Logger log = Logger.getRootLogger();
		Employee emp = new Employee();
		boolean a=true;

		EmployeeDaoImpl repo = new EmployeeDaoImpl(con);
		try {
            repo.createTable(); 
          
        }catch (SQLException e){
            log.error(e);
            
            return;    
        }
		
		while (a) {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("\n");
			 System.out.println("\n");
			 
		    System.out.println("****WELCOME TO EMPLOYEE DETAILS TABLE****");
		    System.out.println("\n");
			System.out.println("Press Key=1 : To Insert the Record");
			System.out.println("Press Key=2 : To Select All the Record");
			System.out.println("Press Key=3 : TO Select Record by First Name");
			System.out.println("Press Key=4 : To Select Record by Date of Birth");
			System.out.println("Press Key=5 : To Select Record by Annivarsary ");
			System.out.println("Press Key=6 : TO Delete Record by First Name");
			System.out.println("Press Key=7 : TO Update Record by Id");
			System.out.println("Press Key=8 : TO Drop the Table");
			System.out.println("Press Key=9 : Exit");
			System.out.println("\n");
			System.out.println("Enter the Key value:");
			int key = scanner.nextInt();
			
			
			if (key == 1) {

				boolean result = repo.add();
				if (result) {
					log.info("One Employee Added");
				}

			}

			if (key == 2) {
				List<Employee> list = repo.findAll();

				for (Employee eachEmployee : list) {
					log.info(eachEmployee);
				}
			}
			if (key == 3) {

				List<Employee> list1;

				list1 = repo.findByName();
				for (Employee eachEmployee : list1) {
					log.info(eachEmployee);
				}
			}

			if (key == 4) {
				List<Employee> list2;

				list2 = repo.findByDob();
				for (Employee eachEmployee : list2) {
					log.info(eachEmployee);
				}
			}

			if (key == 5) {
				List<Employee> list3;

				list3 = repo.findByAnvDate();
				for (Employee eachEmployee : list3) {
					log.info(eachEmployee);
				}
			}

			if (key == 6) {
				boolean result;

				result = repo.deleteByFname();
				if (result) {
					log.info("One Employee delete");
				}
			}

			if (key == 7) {
				boolean result;

				result = repo.updateById();
				if (result) {
					log.info("One Employee data updated with Id");
				}
				

			}
			if (key == 8) {
				boolean result;

				result = repo.dropTable();
				if (result) {
					log.info("Table is Dropped");
				}
				

			}
			
			
			if(key == 9) {
				log.info("Terminated from process");
				break;
				
			}

		}
	}
}
