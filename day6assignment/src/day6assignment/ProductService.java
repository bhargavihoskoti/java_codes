package day6assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
	
	private ArrayList<Product> list;
	
	
	
//	public ArrayList<Product> get(int i) {
//		return this.list;
//	}
	
	public ProductService( ) {
		super();
		this.list = new ArrayList<>();
	}
	public boolean add(Product item) {
		return this.list.add(item);
	}


	public List<Product> PrintList() {

//		for(int i=0;i<3;i++) {
//		return  add1(list.get(i));
//		}
		return list;
	}
}
	
	
	
	
	
