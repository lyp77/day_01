package com.test.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service(value="userservice")/*value��ʡ��*/
public class Userservice {
//	@Autowired /* �Զ�ע������*/
//	private Userdao userdao;
	@Resource(name="userdao") /* ָ��ע����Ķ���*/
	private Userdao userdao;
	
	public void test1() {
		System.out.println(1);
		userdao.add();
	}
}
