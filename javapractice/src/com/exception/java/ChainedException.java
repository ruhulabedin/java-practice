package com.exception.java;

public class ChainedException {
	public static void main (String agrs[]) {
		try {
			String[] str = { "foo" };
			System.out.println("About to throw ArrayIndexOutOfBoundsException");
			// following statement has out-of-bounds access
			String functionName = str[10];
		} catch (ArrayIndexOutOfBoundsException oob) {
			System.out
					.println("Wrapping ArrayIndexOutOfBoundsException into a RuntimeException");
			throw new RuntimeException(oob);
		}
	}
}