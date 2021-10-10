package com.training;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int salary;


public Employee() {
	super();
}
public Employee(int employeeId, String employeeName, int salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getSalary() {
	return salary;
}


public void setSalary(int salary) {

	if(salary>5000)
	{
		this.salary = salary;
	}
	
	else {
		System.out.println("Invalid entry");
	}
	
}
}


