package com.test.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.test.deom1.Person;

public class testIOC {
		@Test
		public void testUser(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Person person= (Person) context.getBean("aaa");
			System.out.println(person);
			person.test1();
			
		}
		
}
