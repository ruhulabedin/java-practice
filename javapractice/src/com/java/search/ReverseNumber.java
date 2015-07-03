package com.java.search;

public class ReverseNumber {
	public static void main(String[] args) {

		int originalNumber = 123456;
		int reverseNumber = 0;

		while (originalNumber != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + (originalNumber % 10);
			originalNumber = originalNumber / 10;

		}
		
		System.out.println(reverseNumber);

	}

}
