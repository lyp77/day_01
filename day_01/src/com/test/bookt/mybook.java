package com.test.bookt;

import org.aspectj.lang.ProceedingJoinPoint;

public class mybook {
	
		public void test11() {
			System.out.println("bf1");
		}
		public void test22() {
			System.out.println("af2");
		}
		public void test33(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
			System.out.println("saurround111bf");
			proceedingJoinPoint.proceed();
			System.out.println("saurround111af");
		}
}
