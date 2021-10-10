package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.example.demo.utils.DbConnection;

public class Application {
	public static void main(String[] args) throws Exception {
		Connection con = DbConnection.getOracleConnection();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EMP ID:");
		int id = sc.nextInt();
		System.out.println("firstname:");
		String firstName = sc.next();
		System.out.println("lastname:");
		String lastName = sc.next();
		System.out.println("City:");
		String city = sc.next();
		System.out.println("phno:");
		double phoneNumber = sc.nextDouble();
		System.out.println("DOB:");
		String birth = sc.next();
		System.out.println("ANV:");
		String anv = sc.next();

		// for date of birth
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yy");
		java.util.Date udob = sdf1.parse(birth);
		java.sql.Date sqdob = new java.sql.Date(udob.getTime());
		// for date of Anniversary
		java.util.Date udoa = sdf1.parse(anv);
		java.sql.Date sqdoa = new java.sql.Date(udoa.getTime());
		
		
		String sql="insert into Employee values(?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, firstName);
		pstmt.setString(3, lastName);
		pstmt.setString(4, city);
		pstmt.setDouble(5, phoneNumber);
		pstmt.setDate(6, sqdob);
		pstmt.setDate(7, sqdoa);

		int rowAdded = pstmt.executeUpdate();
		if (rowAdded>0) {
			System.out.println("Row is not inserted");
		}
		
		
		//Display table
		
		String sql1 ="select * from employee where id =(?)";
		PreparedStatement stmt = con.prepareStatement(sql1);
		
		System.out.println("Search by Id:");
		int id1 = sc.nextInt();
		stmt.setInt(1,id1);
		ResultSet rs=stmt.executeQuery();
		
		
		while(rs.next()) {
			
			System.out.println("Id:"+rs.getInt(1));
			System.out.println("First Name:"+rs.getString(2));
			System.out.println("Last ANme:"+rs.getString(3));
			System.out.println("City:"+rs.getString(4));
			System.out.println("PhoneNumber:"+rs.getDouble(5));
			System.out.println("DOB:"+rs.getString(6));
			System.out.println("ANV:"+rs.getString(7));
		}
		
		//Update table
		String sql2 ="Update Employee set city=? where id=?";
		PreparedStatement utmt = con.prepareStatement(sql2);
		System.out.println("Enter to update city:");
		String city1=sc.next();
		utmt.setString(1, city1);
		System.out.println("Enter ID where to update:");
		int id2 = sc.nextInt();
		utmt.setInt(2, id2);
		
		int rowUpdate = utmt.executeUpdate();
		if(rowUpdate>0) {
			System.out.println("Table with"+ id2 +"Updated");
		}
		
		//Delete Table
		String sql3="Delete from employee where firstname=?";
		PreparedStatement dtmt = con.prepareStatement(sql3);
		System.out.println("Enter First Name to delete the record:");
		String fname= sc.next();
		dtmt.setString(1, fname);
		
		int rowDeleted = dtmt.executeUpdate();
		if(rowDeleted>0) {
			System.out.println("Row with first name"+ fname +"is deleted");
		}
		
	}
}

