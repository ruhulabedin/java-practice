package com.java.search;

public class BinarySearch {
	public static void main(String[] args) {

		int binarySearchArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40,
				50, 60, 70, 80, 90, 100 };
		int searchValue = 2;
		int first = 0;
		int last = binarySearchArray.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (binarySearchArray[middle] < searchValue) {
				first = middle + 1;
			}

			else if (binarySearchArray[middle] == searchValue) {
				System.out.println(searchValue + "search found in" + (middle+1));
				break;
			}

			else {
				last = middle - 1;
				middle = (first + last) / 2;
			}
		}

		if (first > last)
			System.out.println("Not found! %d is not present in the list.\n"
					+ searchValue);
	}
}
