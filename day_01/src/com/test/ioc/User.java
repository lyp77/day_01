package com.test.ioc;

public class User {
	private String a ;
	public User(){}
	public User(String a) {
		this.a = a; 
	}
	public void add(){
		System.out.println(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.add();
	}

}
