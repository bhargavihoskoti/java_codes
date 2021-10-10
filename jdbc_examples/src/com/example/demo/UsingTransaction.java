package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.demo.utils.DbConnection;

public class UsingTransaction {
	public static void main(String[] args) {
		Connection con= DbConnection.getOracleConnection();
		
		try {
			con.setAutoCommit(false);
			
			String sql="insert into student(rollNumber,studentName,markScored)"+" values(202,'john',67)";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			int rowAdded =pstmt.executeUpdate();
			
			System.out.println(rowAdded);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
//Advanced code
//package com.example.demo;
//import java.sql.*;
//import com.example.demo.utils.DbConnection;
//
//public class UsingTransaction {
//
//public static void main(String[] args) {
//Connection con = DbConnection.getOracleConnection();
//
//try {
//con.setAutoCommit(false);
//
//String sql = "insert into student(rollNumber,studentName,markScored) "
//+ "values(201,'tom',56)";
//
//PreparedStatement pstmt = con.prepareStatement(sql);
//
//pstmt.executeUpdate();
//
//Savepoint sp1= con.setSavepoint("sp1");
//
//String sql2 = "insert into student(rollNumber,studentName,markScored)"
//+ "values(202,'tomtom',76)";
//
//PreparedStatement pstmt2 = con.prepareStatement(sql2);
//
//pstmt2.executeUpdate();
//
//Savepoint sp2 =con.setSavepoint("sp2");
//
//
//String sql3 = "insert into student(rollNumber,studentName,markScored) "
//+ "values(203,'pom',66)";
//
//PreparedStatement pstmt3 = con.prepareStatement(sql3);
//pstmt3.executeUpdate();
//
//Savepoint sp3 = con.setSavepoint("sp3");
//
//con.rollback(sp2);
//
//con.commit();//commit operation
//
//System.out.println("Done");
//
//} catch (SQLException e) {
//e.printStackTrace();
//}
//
//}
//
//
//
//}
