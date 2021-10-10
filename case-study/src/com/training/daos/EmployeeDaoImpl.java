package com.training.daos;

import com.training.entity.Employee;
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

	public EmployeeDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	public boolean add() {
		Logger log=Logger.getRootLogger();
		Scanner sc = new Scanner(System.in);

		String sql = "insert into Employee values(?,?,?,?,?,?,?,?)";
		int rowAdded = 0;
		System.out.println("Enter The Details of Employee");
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			System.out.println("Enter EMP ID:");
			int id = sc.nextInt();
			System.out.println("First Name:");
			String firstName = sc.next();
			System.out.println("Last Name:");
			String lastName = sc.next();
			System.out.println("City:");
			String city = sc.next();
			System.out.println("Email:");
			String email = sc.next();
			System.out.println("Phone Number:");
			double phoneNumber = sc.nextLong();
			System.out.println("Date of Birth:");
			DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate bod = LocalDate.parse(sc.next(), formater);
			System.out.println("Anniversary Date:");
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
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded == 1 ? true : false;
	}

	public List<Employee> findAll() {

		String sql = "Select * from Employee";

		List<Employee> list = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println("ID:" + rs.getInt(1));
				System.out.println("First Name:" + rs.getString(2));
				System.out.println("Last Name:" + rs.getString(3));
				System.out.println("City:" + rs.getString(4));
				System.out.println("Email Id:" + rs.getString(5));
				System.out.println("Phone Number:" + rs.getLong(6));
				System.out.println("Date Of Birth:" + rs.getString(7));
				System.out.println("Anniversaray Date:" + rs.getString(8));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Employee> findByName()  {

		String sql = "Select * from Employee where firstname=?";

		List<Employee> list1 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Search by firstname:");
			String fname = sc.next();
			pstmt.setString(1, fname);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println("Id:" + rs.getInt(1));
				System.out.println("First Name:" + rs.getString(2));
				System.out.println("Last Name:" + rs.getString(3));
				System.out.println("City:" + rs.getString(4));
				System.out.println("EmailId:" + rs.getString(5));
				System.out.println("PhoneNumber:" + rs.getLong(6));
				System.out.println("DOB:" + rs.getString(7));
				System.out.println("ANV:" + rs.getString(8));
			}

			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list1;
	}

	public List<Employee> findByDob()  {

		String sql = "select firstname,email from employee where to_char(dateofbirth,'dd-mm')=?";

		List<Employee> list2 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Date of Birth(dd-MM):");
			String birth = sc.next();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm");
			java.util.Date udob = sdf1.parse(birth);
			java.sql.Date sqdob = new java.sql.Date(udob.getTime());

			pstmt.setString(1, birth);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println("First Name:" + rs.getString(1));

				System.out.println("EmailId:" + rs.getString(2));

			}

			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
	}

	public List<Employee> findByAnvDate()  {
		
		String sql = "select firstname,phonenumber from employee where to_char(anvdate,'dd-mm')=?";

		List<Employee> list3 = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Anniversaray Date(dd-MM):");
			String anv = sc.next();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm");
			java.util.Date udoa = sdf1.parse(anv);
			java.sql.Date sqdoa = new java.sql.Date(udoa.getTime());

			pstmt.setString(1, anv);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println("First Name:" + rs.getString(1));

				System.out.println("PhoneNumber:" + rs.getLong(2));

			}

			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list3;
	}

	public boolean deleteByFname() {
		Scanner sc = new Scanner(System.in);
		String sql = "Delete from employee where firstname=?";
		int rowDeleted = 0;

		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			System.out.println("Enter First Name to delete the record:");
			String fname = sc.next();
			pstmt.setString(1, fname);

			rowDeleted = pstmt.executeUpdate();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowDeleted == 1 ? true : false;
	}

	public boolean updateById() {
		Scanner sc = new Scanner(System.in);
		String sql = "Update Employee set city=? where id=?";
		;
		int rowUpdated = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			System.out.println("Enter First Name to delete the record:");
			String city = sc.next();
			pstmt.setString(1, city);
			int id = sc.nextInt();
			pstmt.setInt(2, id);

			rowUpdated = pstmt.executeUpdate();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpdated == 1 ? true : false;

	}

}
