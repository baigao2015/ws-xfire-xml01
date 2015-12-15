package com.multipless.egogoal.ws.server.impl;

import com.multipless.egogoal.ws.server.Book;
import com.multipless.egogoal.ws.server.BookService;

/*
 * 
 * http://www.tuicool.com/articles/JNVNNv3
 */
public class BookServiceImpl implements BookService {

	public Book getBookById(int id) {
		Book book = new Book(1, "china");
		return book;
	}

	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "this is " + str + ".";
	}

}
