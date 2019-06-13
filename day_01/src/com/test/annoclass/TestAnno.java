package com.test.annoclass;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class TestAnno {
	@Test
	public void publ() {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		bookService bookService = (com.test.annoclass.bookService) context.getBean("bookservice");
		System.out.println(bookService);
		bookService.add();;
	}
}
