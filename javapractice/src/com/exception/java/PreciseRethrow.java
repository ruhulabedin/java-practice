package com.exception.java;

public class PreciseRethrow {
	public static void main(String[] str) {
		try {
			foo();
		} catch (NumberFormatException ife) {
			System.out.println(ife);
		}
	}

	static private void foo() throws NumberFormatException {
		//int i = Integer.parseInt("ten");
		try {
			int i = Integer.parseInt("ten");
		} catch (Exception e) {
			throw e;
		}
	}
}