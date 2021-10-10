package com.training.repos;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookRepository implements CrudRepository {

	
	private ArrayList<Book> bookList;
	
	public BookRepository() {
		super();
		this.bookList= new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
//only we can send obj of type Book
		System.out.println("list size:"+this.bookList.size());
		return this.bookList.add(book);
	}

	@Override
	public List<Book> findAll() {

		return this.bookList;
	}

	@Override
	public boolean update(Book book) {

		return false;
	}

	@Override
	public boolean remove(Book book) {

		return false;
	}

}
