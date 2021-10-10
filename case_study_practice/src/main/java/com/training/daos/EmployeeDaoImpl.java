package com.training.daos;

import com.training.entity.Employee;
//import com.training.exception.NameNotFoundException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

import org.apache.log4j.Logger;

import com.training.entity.Employee;

public class EmployeeDaoImpl {

	private Connection con;
	Scanner sc = new Scanner(System.in);

	public EmployeeDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	public boolean add() {
	
	

		String sql = "insert into Employee values(?,?,?,?,?,?,?,?)";
		int rowAdded = 0;
		System.out.println("Enter The Details of Employee");
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			Logger log=Logger.getRootLogger();
			log.info("Enter EMP ID:");
			int id = sc.nextInt();
			log.info("First Name:");
			String firstName = sc.next();
			log.info("Last Name:");
			String lastName = sc.next();
			log.info("City:");
			String city = sc.next();
			log.info("Email:");
			String email = sc.next();
			log.info("Phone Number:");
			double phoneNumber = sc.nextLong();
			log.info("Date of Birth:");
			DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate bod = LocalDate.parse(sc.next(), formater);
			log.info("Anniversary Date:");
			LocalDate anvDate = LocalDate.parse(sc.next(), formater);

			pstmt.setInt(1, id);
			pstmt.setString(2, firstName);
			pstmt.setString(3, lastName);
			pstmt.setString(4, city);
			pstmt.setString(5, email);
			pstmt.setDouble(6, phoneNumber);
			pstmt.setDate(7, Date.valueOf(bod));
			pstmt.setDate(8, Date.valueOf(anvDate));

			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded == 1 ? true : false;
	}

	public List<Employee> findAll() {
		Logger log=Logger.getRootLogger();
		String sql = "Select * from Employee";

		List<Employee> list = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
			
				log.info("ID:" + rs.getInt(1));
				log.info("First Name:" + rs.getString(2));
				log.info("Last Name:" + rs.getString(3));
				log.info("City:" + rs.getString(4));
				log.info("Email Id:" + rs.getString(5));
				log.info("Phone Number:" + rs.getLong(6));
				log.info("Date Of Birth:" + rs.getDate(7));
				log.info("Anniversaray Date:" + rs.getDate(8));
				log.info("\n");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Employee> findByName() throws NameNotFoundException  {
		Logger log=Logger.getRootLogger();
		String sql = "Select * from Employee where firstname=?";

		List<Employee> list1 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			log.info("Search by firstname:");
			String fname = sc.next();
			pstmt.setString(1, fname);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
			

                log.info("Id:" + rs.getInt(1));
                log.info("First Name:" + rs.getString(2));
                log.info("Last Name:" + rs.getString(3));
                log.info("City:" + rs.getString(4));
                log.info("EmailId:" + rs.getString(5));
                log.info("PhoneNumber:" + rs.getLong(6));
                log.info("DOB:" + rs.getString(7));
                log.info("ANV:" + rs.getString(8));
			
			}
			else {
				throw new NameNotFoundException("First Name is not Found");
			}
			
			
			

		}catch (SQLException  e) {
			e.printStackTrace();
		} 
		
		
		return list1;
	}

	public List<Employee> findByDob()  throws NameNotFoundException  {
		Logger log=Logger.getRootLogger();
		String sql = "select firstname,email from employee where to_char(dateofbirth,'dd-mm')=?";

		List<Employee> list2 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			log.info("Enter Date of Birth(dd-MM):");
			String birth = sc.next();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm");
			java.util.Date udob = sdf1.parse(birth);
			java.sql.Date sqdob = new java.sql.Date(udob.getTime());

			pstmt.setString(1, birth);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				log.info("First Name:" + rs.getString(1));

				log.info("Email Id:" + rs.getString(2));

			}else {
				throw new NameNotFoundException("Employee with this date is not present");
			}
			

			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list2;
		 }


	public List<Employee> findByAnvDate() throws NameNotFoundException  {
		Logger log=Logger.getRootLogger();
		String sql = "select firstname,phonenumber from employee where to_char(anvdate,'dd-mm')=?";

		List<Employee> list3 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			log.info("Enter Anniversaray Date(dd-MM):");
			String anv = sc.next();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm");
			java.util.Date udoa = sdf1.parse(anv);
			java.sql.Date sqdoa = new java.sql.Date(udoa.getTime());

			pstmt.setString(1, anv);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				log.info("First Name:" + rs.getString(1));

				log.info("PhoneNumber:" + rs.getLong(2));

			}else {
				throw new NameNotFoundException("Employee with this date is not present");
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list3;
	}

	public boolean deleteByFname() {
		Logger log=Logger.getRootLogger();
		
		String sql = "Delete from employee where firstname=?";
		int rowDeleted = 0;
		
		Employee emp= new Employee();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			log.info("Enter First Name to delete the record:");
			String fname = sc.next();
			pstmt.setString(1, fname);
		

			rowDeleted = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		return rowDeleted == 1 ? true : false;
	}

	public boolean updateById() {
		Logger log=Logger.getRootLogger();
		
		String sql = "update employee set city=? where id=?";
		
		int rowUpdated = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			log.info("Enter City name for the ID to UPDATE the record:");
			String city = sc.next();
			pstmt.setString(1, city);
			log.info("Enter Id:");
			int id = sc.nextInt();
			pstmt.setInt(2, id);

			rowUpdated = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpdated == 1 ? true : false;

	}

}
