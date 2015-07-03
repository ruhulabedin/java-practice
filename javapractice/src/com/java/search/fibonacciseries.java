package com.java.search;

public class fibonacciseries {
	public static void main(String[] args) {

		long fibonacciArray[] = new long[100];
		fibonacciArray[0] = 1;
		fibonacciArray[1] = 1;

		for (int i = 2; i < fibonacciArray.length; i++) {
			fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
			System.out.println(fibonacciArray[i]);
		}

	}
}
