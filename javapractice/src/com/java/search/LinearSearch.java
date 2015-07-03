package com.java.search;

public class LinearSearch {

	public static void main(String[] args) {

		int searchArray[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int searchNumber = 40;

		int count = 0;

		for (int i = 0; i < searchArray.length; i++) {

			if (searchArray[i] == searchNumber) {

				System.out.println("search number in" + (i + 1) + "position");
				count++;

			}

		}

		if (count == 0) {
			System.out.println("element not found");
		}

		else {
			System.out.println("element found in " + count + " times");
		}

	}

}
