package com.training.ifaces;

public interface ManageData extends FindData {
	
	public boolean add(Object obj);
	public int update(Object obj);
	public int remove(Object obj);
}
