package com.book;
/**
 * @author : Natanim
 *
 * @date : Feb 1, 2023
 * 
 * @Description : A bean class model for a book that has parametrized constructors and getter and setter methods.
 */

import com.exception.InvalidBookException;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	//parametrized constructor to initalize the fields
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		if(bookId.charAt(0) == 'B' && bookId.length() < 5) { // user input validation for bookId attribute
			this.bookId = bookId;
		} else { 
			//explicitly throwing user defined exception
			throw new InvalidBookException("BookId should begin with 'B' and itslength should be less than 4");
		}
		this.title = title;
		this.author = author;
		
		// user input validation for book category attribute
		if(category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others")) {
			this.category = category;
		} else {
			//explicitly throwing user defined exception
			throw new InvalidBookException("Book category not found!");
		}
		
		if(price>0.0) { // user input validation for price
			this.price = price;
		} else {
			//explicitly throwing exception
			throw new InvalidBookException("Price can not be negative!");
		}
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//Overriding toString() method to return the content of an object instead of the memory address
		return "Book [ Id: "+this.bookId+", Title: "+this.title+", Author: "+this.author+", Category: "+this.category+", Price: "+this.price+" ]";
	}
	
	
}
