package com.example.demo;

import java.util.Scanner;
public class Appication {
	
	public static void main(String[] args) {
		boolean flag;
		Scanner scanner= new Scanner(System.in);
		while(flag=true){
		
		System.out.println("Enter Item ID");
		int itemId= scanner.nextInt();
		
		System.out.println("Enter Item Name");
		String itemName= scanner.next();
		
		System.out.println("Enter the rate ");
		double rate =scanner.nextDouble();
		
		System.out.println("Enter the item category");
		String category=scanner.next();
		
		System.out.println("Enter Customer type");
		String type=scanner.next();
		
		Items item= new Items(itemId,itemName,rate,category);
		
		Customer customer = new Customer(type);
		
		ItemService itemService=new ItemService();
		
		System.out.println(itemService.findDiscount(item));
		System.out.println(itemService.findDiscount(item,customer));
		
		
		System.out.println("To terminate press N:");
	
		String entry =scanner.next();
		if(entry.equals("N"))
		{
			break;
		
		}
		else {
			continue;
		}
		}
			
		scanner.close();
		
		
	}

}

