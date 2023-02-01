package com.book;
/**
 * @author : Natanim
 *
 * @date : Feb 1, 2023
 * 
 * @Description : A class to achieve operations on the Book model class 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookStore {
	ArrayList<Book> books = new ArrayList<>(); // Array list collection of type Book object
	
	public void addBooks(Book book) {// add method to add books
		books.add(book);
	}
	
	public void displayAll() { // display method to view all books
		Iterator<Book> itr = books.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void searchByTitle(String title) { // search method to search using the book title
		Iterator<Book> itr = books.iterator();
		boolean isFound = false;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				System.out.println("Book found with the title : "+title);
				System.out.println("Book Id : " + books.get(i).getBookId());
				System.out.println("Tittle : " + books.get(i).getTitle());
				System.out.println("Author : " + books.get(i).getAuthor());
				System.out.println("Category : " + books.get(i).getCategory());
				System.out.println("Price : " + books.get(i).getPrice());
				System.out.println();
				isFound = true;
			}
		}
		
		if(!isFound) {
			System.out.println("Book Not Found!");
		}
	}
	
	public void searchByAuthor(String author) { // search method to search using the book title
		Iterator<Book> itr = books.iterator();
		boolean isFound = false;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getAuthor().equals(author)) {
				System.out.println("Book found with the author " + author);
				System.out.println("Book Id : " + books.get(i).getBookId());
				System.out.println("Tittle : " + books.get(i).getTitle());
				System.out.println("Author : " + books.get(i).getAuthor());
				System.out.println("Category : " + books.get(i).getCategory());
				System.out.println("Price : " + books.get(i).getPrice());
				System.out.println();
				isFound = true;
			}
		}
		
		if(!isFound) {
			System.out.println("Book Not Found!");
		}
	}
}
