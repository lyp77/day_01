package com.test.annoclass;

import javax.annotation.Resource;

public class bookService {
	@Resource(name="bookdao")
	private bookDao bookDao;
	@Resource(name="odersdao")
	private ordersDao ordersDao;
	public void add() {
		System.out.println(12);
		bookDao.book();
		ordersDao.buy();
	}
}
