package com.test.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.test.deom1.Person;

public class testIOC {
		@Test
		public void testUser(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Userservice userservice=  (Userservice) context.getBean("userservice");			
			System.out.println(userservice);
			userservice.test1();;
			
		}
		
}
