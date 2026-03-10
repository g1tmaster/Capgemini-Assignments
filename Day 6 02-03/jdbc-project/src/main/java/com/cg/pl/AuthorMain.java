package com.cg.pl;

import com.cg.bean.Author;
import com.cg.bean.Book;
import com.cg.service.AuthorService;
import com.cg.service.IAuthorService;

public class AuthorMain {

	public static void main(String[] args) {
		IAuthorService as = new AuthorService();
		
		System.out.println(as.updatePrice("chintu", 5000.00));

	}

}
