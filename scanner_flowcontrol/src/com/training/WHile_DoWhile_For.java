package com.training;

public class WHile_DoWhile_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello World");
		}
		
		int j=10;
		do {
			System.out.println("Inside Do While Loop");
			j--;
			
		}while(j>=5);
		
		
		boolean flag=true;
		int k=10;
		
		
		while(flag) {
			System.out.println("Inside while loop");
			k++;
			
			if(k==15) {
				flag=false;
			}
		}

	}

}
