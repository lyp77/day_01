package com.test.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service(value="userservice")/*value可省略*/
public class Userservice {
//	@Autowired /* 自动注入属性*/
//	private Userdao userdao;
	@Resource(name="userdao") /* 指定注入类的对象*/
	private Userdao userdao;
	
	public void test1() {
		System.out.println(1);
		userdao.add();
	}
}
