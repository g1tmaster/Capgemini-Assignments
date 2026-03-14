package com.LMS.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.LMS.model.Librarian;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Librarian l1 = context.getBean("librarian1", Librarian.class);
		
		l1.issueBook();

	}

}
