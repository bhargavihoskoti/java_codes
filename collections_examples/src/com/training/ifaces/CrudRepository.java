package com.training.ifaces;

import java.util.List;

import com.training.model.Book;

public interface CrudRepository {
	
	public boolean add(Book book);   //create
	public List<Book> findAll();     //read
	public boolean update(Book book);//update
	public boolean remove(Book book);//delete =>CRUD
	
}
