package com.java.stringoperation;

public class BusinessServiceTwo {
	public void businessMethod2() {
		// get the context from thread local
		Context context = MyThreadLocal.get();
		System.out.println("-----()()()()()----"+context.getTransactionId());
		System.out.println("-----{}{}{}{}{}------"+context.getTransactionName());
	}
}
