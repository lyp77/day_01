package com.test.bookt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class testIOC {
		@Test
		public void testUser(){
			ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
			book book = (com.test.bookt.book) context.getBean("book1");
			book.bokk();
		}
		 
}
