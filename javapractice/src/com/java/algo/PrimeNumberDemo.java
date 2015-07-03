package com.java.algo;

import java.util.Scanner;

class PrimeNumberDemo {
	public static void main(String args[]) {
		int noOfPrimeGenerated;
		boolean primeStatusCheckFlag = true;
		int numberOfCheck = 3;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		noOfPrimeGenerated = scanner.nextInt();
		System.out.println(2);

		for (int i = 2; i <= noOfPrimeGenerated;) {
			for (int j = 2; j <= Math.sqrt(numberOfCheck); j++) {
				if (j % numberOfCheck == 0) {
					primeStatusCheckFlag = false;
					break;
				}

			}

			if (primeStatusCheckFlag) {
				System.out.println(numberOfCheck);
				i++;
			}

			primeStatusCheckFlag = true;
			numberOfCheck++;

		}

	}
}