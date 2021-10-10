package co.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyJsonparser {
	
	public String javaToJson(Product product) {
		
		Gson parser= new GsonBuilder().setPrettyPrinting().create();
		
		
		return parser.toJson(product);
	}
	
	public Product jsonToJava(String value) {
		Gson parser = new Gson();
		
		return parser.fromJson(value,Product.class);
	}

}
