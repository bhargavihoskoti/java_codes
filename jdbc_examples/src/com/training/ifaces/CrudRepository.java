package com.training.ifaces;

import java.util.*;

import com.training.entity.Student;


public interface CrudRepository<T> {
	
	//public boolean add(T t);   //create
	public List<T> findAll();     //read
	public boolean update(T t);//update
	public boolean remove(T t);//delete =>CRUD
	//public List<T> findById(E e);
	boolean add(Student t);
	
}
