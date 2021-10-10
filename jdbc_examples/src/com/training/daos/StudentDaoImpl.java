package com.training.daos;


import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.training.entity.Student;
import com.training.ifaces.CrudRepository;


public class StudentDaoImpl implements CrudRepository<Student> {

	private Connection con;
	
	public StudentDaoImpl(Connection con) {
		super();
		this.con=con;
	}
	
	@Override
	public boolean add(Student t) {
		
		String sql="insert into Student values(?,?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt=con.prepareStatement(sql)){ 
			pstmt.setInt(1, t.getRollNumber());
			pstmt.setString(2,t.getStudentName());
			pstmt.setDate(3, Date.valueOf(t.getDateOfBirth()));
			pstmt.setDouble(4, t.getMarkScored());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded==1?true:false;
	}

	@Override
	public List<Student> findAll() {
		
		String sql="Select * from Student";
		
		List<Student> list =new ArrayList<>();
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int rollNumber=rs.getInt("rollNumber");
				String studentName=rs.getString("studentName");
				LocalDate dateOfBirth=rs.getDate("dateOfBirth").toLocalDate();
				double markScored=rs.getDouble("markScored");
				
				Student student=new Student(rollNumber,studentName,dateOfBirth,markScored);
				list.add(student);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean update(Student t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Student t) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public List<Student> findById(E e) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	@Override
//	public Student findById(Integer e) {
//		// TODO Auto-generated method stub
//		String sql="select * from student where rollNumber = ?";
//		Student obj=null;
//		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
//			pstmt.setInt(1, e);
//			
//			if(rs.next()) {
//				int rollNumber=rs.getInt("rollNumber");
//				String studentName=rs.getString("studentName");
//				LocalDate dateOfBirth=rs.getDate("dateOfBirth").toLocalDate();
//				double markScored=rs.getDouble("markScored");
//			obj= new Student(rollNumber,studentName,dateOfBirth,markScored);
//			}
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//		return obj;
	}
	
	
	

