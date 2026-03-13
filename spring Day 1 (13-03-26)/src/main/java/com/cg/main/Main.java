package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.HelloWorld;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h1 = context.getBean("hello", HelloWorld.class);
		System.out.println(h1.sayHello());
		System.out.println(h1.getLanguage());
		

	}

}
