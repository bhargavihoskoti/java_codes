package com.training;

public class Application {
	public static void main(String[] args) 
	{
		Employee sam = new Employee();
		
		sam.setEmployeeId(101);
		sam.setEmployeeName("Sam");
		sam.setSalary(6000);
		System.out.println("EmployeeId:"+ sam.getEmployeeId());
		System.out.println("Salary:"+sam.getSalary());
	}

}
