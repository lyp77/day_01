package com.test.annoclass;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Controller(value="user")
@Scope(value="prototype")
public class User {
	
		public void add() {
			System.out.println(1);
		}
}
