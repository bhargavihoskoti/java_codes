package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.training.enitity.OrderBook;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = {"com.example.demo","org.training.enitity"})
@Slf4j
public class SpringIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringIoCApplication.class, args);
	 
		Customer customer=ctx.getBean("shyam",Customer.class);
		
		
		log.info(customer.toString());
		
     
		Product obj =ctx.getBean("gucci",Product.class);
		
		
		log.info(obj.toString());
		
		Invoice inv= ctx.getBean("invoice",Invoice.class);
		
		log.info(inv.toString());
		
		Bill bill= ctx.getBean(Bill.class);
		
		log.info(bill.toString());
		
       OrderBook book= ctx.getBean(OrderBook.class);
		
		log.info(book.toString());
		
		List<Invoice> list = book.getInvList();
		
				list.forEach(System.out::println);
		
		
		ctx.close();
	}

}
