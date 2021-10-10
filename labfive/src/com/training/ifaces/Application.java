package com.training.ifaces;

public class Application {

	public static void main(String[] args) {
		Billable obj=new SoftwareEngineer(2000);
		
		obj.calculate(obj);
		System.out.println("SoftwareEngineer Salary:="+obj.calculate(obj));
		
        Billable obj1=new CivilEngineer(2000);
		
		obj1.calculate(obj);
		System.out.println("CivilEngineer Salary:="+obj1.calculate(obj));
		
        Billable obj2=new Advocate(2000);
		
		obj2.calculate(obj);
		System.out.println("Advocate Salary:="+obj2.calculate(obj));

	}

}
