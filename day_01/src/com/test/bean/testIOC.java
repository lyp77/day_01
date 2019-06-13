package com.test.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class testIOC {
		@Test
		public void testUser(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			bean3 bean3 =  (com.test.bean.bean3) context.getBean("bean3");
			System.out.println(bean3);
		
		}
		
}
