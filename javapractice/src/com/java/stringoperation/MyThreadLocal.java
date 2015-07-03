package com.java.stringoperation;

public class MyThreadLocal {

	public static final ThreadLocal<Context> userThreadLocal = new ThreadLocal<Context>();

	public static void set(Context context) {
		userThreadLocal.set(context);
	}

	public static void unset() {
		userThreadLocal.remove();
	}

	public static Context get() {
		return userThreadLocal.get();
	}
}