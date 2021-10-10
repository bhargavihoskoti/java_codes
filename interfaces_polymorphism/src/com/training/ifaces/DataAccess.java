package com.training.ifaces;

public interface DataAccess {
	
	public boolean add(Object obj);
	public Object[] findAll();
	public Object findById(int id);
	public int update(Object obj);
	public int remove(Object obj);

}
