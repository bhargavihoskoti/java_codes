package day6assignment;

import java.util.Collections;
import java.util.List;

public class Application {
	
	public static void print(List <Product> list) {
		int i=0;
		for (Product eachItem:list) {
		 if(i<3) 
			System.out.println(eachItem);
		 else 
		  break;
		 
		 i++;
		}
	}	

	public static void main(String[] args) {
		

		ProductService service= new ProductService();
		Product item1=new FoodItem(1,"pizza",2,200,true);
		Product item2=new FoodItem(2,"sandwich",4,100,true);
		Product item3=new FoodItem(3,"chips",5,150,true);
		Product item4=new FoodItem(4,"pepsi",9,250,true);
		service.add(item1);
		service.add(item2);
		service.add(item3);
		service.add(item4);
		
		List<Product> list = service.PrintList();
		Collections.sort(list);
		print(list);
		
		ProductService service1= new ProductService();
		Product e1=new Electronics(1,"mouse",5,100,6);
		Product e2=new Electronics(2,"keyboard",15,400,8);
		Product e3=new Electronics(3,"Desktop",10,400,12);
		Product e4=new Electronics(4,"Monitor",9,400,12);
		service1.add(e1);
		service1.add(e2);
		service1.add(e3);
		service1.add(e4);
		
		List<Product> list1 = service1.PrintList();
		Collections.sort(list1);
		print(list1);
		
		
		
		ProductService service2= new ProductService();
		Product a1=new Apparel(1,"tshirt",3,900,6,"puma");
		Product a2=new Apparel(2,"shirt",6,1900,7,"nike");
		Product a3=new Apparel(3,"shoes",9,4900,9,"wrogn");
		Product a4=new Apparel(3,"jacket",8,4900,9,"addidas");
		service2.add(a1);
		service2.add(a2);
		service2.add(a3);
		service2.add(a4);
		List<Product> list2 = service2.PrintList();
		Collections.sort(list2);
		print(list2);
		
		
		
	}

}
