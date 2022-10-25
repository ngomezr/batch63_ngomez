/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 *	
 * 
 */
public class BookRepoImpl implements BookRepo {
	// Repository 
	List<BookBean> books = new ArrayList<>();
	
	// IIB - Instance Initialization Block
	{
		// Populating data to Repository
		books.add(new BookBean(1, "JavaSE", "Keenan", 200));
		books.add(new BookBean(2, "Angular", "LACPD", 300));
		books.add(new BookBean(3, "Spring", "Richard", 650));
	}
	
	@Override
	public void addBook(BookBean bookBean) {
		books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getBookId() == bookId) {
				books.remove(i);
			}
		}
	}

	@Override
	public BookBean findBookById(int bookId) {
		BookBean book = new BookBean();
		for (int i = 0; i < books.size(); i++) {
			book = null;
			if(books.get(i).getBookId() == bookId) {
				System.out.print("Book Found in Repository");
				book = books.get(i);
				return book;
			}
		}
		return null;
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		BookBean book = new BookBean();
//		System.out.println(author);
		for (int i = 0; i < books.size(); i++) {
			book = null;
			if(books.get(i).getBookAuthor().equals(author)) {
				System.out.println("Book Found in Repository: ");
				book = books.get(i);
				return book;
			}
		}
		return null;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		List<BookBean> tempBooks = new ArrayList<>();
		
		for (int i = 0; i < books.size(); i++) {
			if(minPrice <= books.get(i).getPrice() && books.get(i).getPrice() <= maxPrice) {
				tempBooks.add(books.get(i));
			}
			
		}
		return tempBooks;
	}

}
