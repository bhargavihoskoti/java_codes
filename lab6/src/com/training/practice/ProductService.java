package com.training.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ProductService {
	private ArrayList<Product> list= null;
	
	public ArrayList<Product> getList() {
		return list;
	}
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
	ProductService() {
		list = new ArrayList<Product>();
		
	}
	public boolean add(Product item) {
		return list.add(item);
	}
	public ArrayList<Product> topThreeItems(String itemType){
		Collections.sort(list);
		ArrayList<Product> result = new ArrayList<>();
		
		int k=0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).itemType.equals(itemType)) {
				result.add(list.get(i));
				k++;
				if(k==3)
					return result;
			}
		}
			
		return result;
	}

}
