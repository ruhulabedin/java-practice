package com.java.search;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int convertToAmstrongNumber = 123;
		int digit = 0;
		int remainder = 0;
		long sum = 0;

		// digit count of a given number

		while (convertToAmstrongNumber != 0) {
			convertToAmstrongNumber = convertToAmstrongNumber / 10;
			digit = digit + 1;
		}

		while (convertToAmstrongNumber != 0) {
			remainder = convertToAmstrongNumber % 10;
			sum = (long) (sum + Math.pow(remainder, digit));
			convertToAmstrongNumber = convertToAmstrongNumber / 10;
		}

	}

}
