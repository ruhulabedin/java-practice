package com.java.recursion;

public class Recursion {
	public static void main(String[] args) {
		Recursion recurtion = new Recursion();
		System.out.println(recurtion.factorial(4));
		System.out.println(recurtion.reverseStirng("hello"));
		System.out.println(recurtion.fibonacciSeries(10));
	}

	public int factorial(int n) {
		int result = 0;
		if (n == 1) {
			return result = 1;
		} else
			result = factorial(n - 1) * n;
		return result;

	}

	public String reverseStirng(String originalString) {
		if ((null == originalString) || (originalString.length() <= 1)) {
			return originalString;
		} else {
			return reverseStirng(originalString.substring(1))
					+ originalString.charAt(0);

		}
	}

	public int fibonacciSeries(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}

		else {
			return fibonacciSeries(number - 2) + fibonacciSeries(number - 1);
		}

	}
}
