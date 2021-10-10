package com.example.demo;

public class ItemService {
	
	public double findDiscount(Items item) {
		
    return item.getRatePerUnit()*0.05;
		
	
	}
	
	
	public double findDiscount(Items item, Customer customer)
	{
		
		if(customer.getType().equals("corporate"))
		{
		return (item.getRatePerUnit()*0.15);	
			
		}
		else if(customer.getType().equals("retail"))
		{
			return(item.getRatePerUnit()*0.10);
		}
		return findDiscount(item);
			
	}

}

