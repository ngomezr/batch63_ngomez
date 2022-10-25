/**
 * 
 */
package com.cogent.client;

import java.util.List;
import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 * 
 * 
 */
public class BookLibrary {

	public static void main(String[] args) {
		// Connecting our Client Class to Service and onwards
		BookService bookService = new BookServiceImpl();

		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("\t Menu");
		System.out.println("***********************");
		System.out.println("1. Add a new Book " + "\n" + "2. Delete Book by Id" + "\n" + "3. Find Book by Id" + "\n"
				+ "4. Find Book by Author name" + "\n" + "5. Find Books by a Price Range" + "\n" + "6. Exit Program");
		System.out.println();
		int choice = 0;
		System.out.print("Enter a choice on the menu: ");
		choice = scanner.nextInt();
		// Declaring a book but set to Null
		BookBean bookBean = null;

		while (choice != 6) {
			switch (choice) {
			case 1:
				bookBean = new BookBean();
				System.out.println("Enter book Id");
				bookBean.setBookId(scanner.nextInt());
				System.out.println("Enter Book title");
				bookBean.setBookTitle(scanner.next());
				System.out.println("Enter Book Author");
				bookBean.setBookAuthor(scanner.next());
				System.out.println("Enter Book Price");
				bookBean.setPrice(scanner.nextDouble());
				bookService.addBook(bookBean);
				break;
			case 2:
				System.out.println("Please enter a Book Id to delete from Repository: ");
				int bookId = scanner.nextInt();
				BookBean bookDeleted = bookService.findBookById(bookId);
				if(bookDeleted != null) {
					System.out.println(" & will be deleted. ");
					bookService.deleteBookById(bookId);
				} else {
					System.out.println("Book not found!");
				}
				break;
			case 3:
				System.out.println("Please enter the book Id");
				BookBean book = bookService.findBookById(scanner.nextInt());
				if (book != null) {
					System.out.println("\n");
					System.out.println("Book Id: "+ book.getBookId() 
					+ "\n" + "Book Title: " + book.getBookTitle() 
					+ "\n" + "Book Author: " + book.getBookAuthor() 
					+ "\n" + "Price:" + book.getPrice());
				} else {
					System.out.println("Book not found!");
				}
				break;
			case 4:
				System.out.println("Please enter an Author name: ");
				BookBean bookAuthor = bookService.findBookByAuthor(scanner.next());
				if(bookAuthor != null) {
					System.out.println();
					System.out.println("Book Id: "+ bookAuthor.getBookId() 
					+ "\n" + "Book Title: " + bookAuthor.getBookTitle() 
					+ "\n" + "Book Author: " + bookAuthor.getBookAuthor() 
					+ "\n" + "Price:" + bookAuthor.getPrice());
				} else {
					System.out.println("Book not found!");
				}
				break;
			case 5:
				System.out.println("Enter a minimum price: ");
				double minPrice = scanner.nextDouble();
				System.out.println("Enter a maximum price: ");
				double maxPrice = scanner.nextDouble();
				List<BookBean> booksRanged = bookService.findBookWithPriceRange(minPrice, maxPrice);
				System.out.println("Books from Price Range of: (" + minPrice + " to " + maxPrice + ")" );
				for(int i = 0; i < booksRanged.size(); i++) {
					System.out.println("Book Id: "+ booksRanged.get(i).getBookId() 
					+ "\n" + "Book Title: " + booksRanged.get(i).getBookTitle() 
					+ "\n" + "Book Author: " + booksRanged.get(i).getBookAuthor() 
					+ "\n" + "Price:" + booksRanged.get(i).getPrice());
					System.out.println();
				}
				break;

			}
			System.out.println("\n***********************");
			System.out.println("\t Menu");
			System.out.println("***********************");
			System.out.println("1. Add a new Book " + "\n" + "2. Delete Book by Id" + "\n" + "3. Find Book by Id" + "\n"
					+ "4. Find Book by Author name" + "\n" + "5. Find Books by a Price Range" + "\n"
					+ "6. Exit Program");

			System.out.println();
			System.out.print("Enter a choice on the menu: ");
			choice = scanner.nextInt();
		}
		System.out.println("\nGoodBye!");

	}

}
