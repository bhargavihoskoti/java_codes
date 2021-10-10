package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

@Configuration
public class ApplicationConfig {
	
	//Factory Method
	//Spring IoC container will call this method and
	//register a bean with the id "gou"
	//"gou" being the method name.
	@Bean
	public Customer gou() {
		
		return new Customer(101,"Gouri",9978465788L);
	}
	
	@Bean
	public Customer shyam() {
		
		return new Customer(102,"Shyam",9958465768L);
	}
	
	@Bean
	public Product fridge() {
		
		return new Product(203,"Samasung Fridge",67890);
	}
	
	//Spring IoC container will call this method and
	//register a bean with the id "gucci"
	//"gucci" being the method name.
	//overriding the default name which is method name with custom name
	
	@Bean(name="gucci")
	public Product bag() {
		
		return new Product(201,"Gucci",19999);
	}
	
	//Refering the Bean
	@Bean
	public Bill inv() {
		
		return new Bill(bag(),gou());//method reference
		
	}
	
	@Bean(name="gourisInvoice")
	public Invoice gousInv() {
		
		return new Invoice(bag(),gou());
	}
	
	@Bean(name="samInvoice")
	public Invoice samInv() {
		
		return new Invoice(fridge(),shyam());
	}
	
	
	
}
