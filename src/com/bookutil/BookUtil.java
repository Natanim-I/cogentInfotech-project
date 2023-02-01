package com.bookutil;

import com.book.Book;
import com.book.BookStore;
import java.util.Scanner;

public class BookUtil {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookStore bookStore = new BookStore();
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the book id : ");
			String bookId = sc.next();
			System.out.println("Enter the book title : ");
			String title = sc.next();
			System.out.println("Enter the book author : ");
			String author = sc.next();
			System.out.println("Enter the book category : ");
			String category = sc.next();
			System.out.println("Enter the book price : ");
			float price = sc.nextFloat();
			Book book = new Book(bookId,title,author,category,price);
			
			bookStore.addBooks(book);
		}
		bookStore.searchByTitle("JavaProgramming");
		bookStore.searchByAuthor("Natanim");
		bookStore.displayAll();
	}
}
