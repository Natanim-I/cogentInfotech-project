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
		while(itr.hasNext()) {
			if(itr.next().getTitle() == title) {
				System.out.println("Book Found");
				System.out.println(itr.next());
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
		while(itr.hasNext()) {
			if(itr.next().getAuthor() == author) {
				System.out.println("Book Found");
				System.out.println(itr.next());
				isFound = true;
			}
		}
		if(!isFound) {
			System.out.println("Book Not Found!");
		}
	}
}
