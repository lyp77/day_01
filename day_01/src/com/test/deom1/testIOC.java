package com.test.deom1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class testIOC {
		@Test
		public void testUser(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			book aa =  (com.test.deom1.book) context.getBean("bookseter");
			System.out.println(aa);
			aa.demobook();
		}
		 
}
