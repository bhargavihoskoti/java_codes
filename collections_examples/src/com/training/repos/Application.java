package com.training.repos;

import java.util.Collections;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.utils.AuthorComparator;
import com.training.utils.BookNameComparator;

public class Application {
	
	public static void print(List <Book> bookList) {
		for (Book eachBook:bookList) {
			System.out.println(eachBook);
		
	}
	}		

	public static void main(String[] args) {

		Book book1 = new Book(100,"Head First Java","Kathysieera",500);
		Book book2 = new Book(101,"First Java2","sieera",550);
		Book book3 = new Book(102,"Java3","era",600);
		
		CrudRepository repo = new BookRepository();
		repo.add(book1);
		repo.add(book2);
		repo.add(book3);
		
		List<Book> bookList = repo.findAll();
		
		for (Book eachBook:bookList) {
			System.out.println(eachBook);
		
		}

		//accepts duplicate and replaces the position
//			bookList.set(1, book3);
//			System.out.println(bookList.get(1) +"," +bookList.get(2));
			//it is duplicated at location 2index 1
		
		Collections.sort(bookList);
		System.out.println("sorted by number");
		print(bookList);
		
		Collections.sort(bookList, new BookNameComparator());
		System.out.println("sorted by Name");
		print(bookList);
		
		Collections.sort(bookList, new AuthorComparator());
		System.out.println("sorted by author");
		print(bookList);
		

} 
}
