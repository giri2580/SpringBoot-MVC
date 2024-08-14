package com.boot.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.project.model.Book;



@Service
public class Bookservice {

	
	public static List<Book> books=new ArrayList<Book>();
	
	 static {
		
		 		books.add(new Book(1001,"Spring","Mr.giri"));
		 		books.add(new Book(1002,"SpringBoot","Mr.hiri"));
		 		books.add(new Book(1003,"Microservices","Mr.siri"));
		 	}
	
	 
	 	public List<Book> getbooks()
	 	{
	 		return books;
	 	}


		public boolean savebookData(Book book) {
			
			return books.add(book);
			
		}


		public boolean deleteBookData(Integer isbn) {
			
			Book book=books.stream()
			     .filter(b->b.getIsbn().equals(isbn))
			     .findFirst()
			     .get();
			return books.remove(book);
			
		}
	 	
	 	
	 	
}
