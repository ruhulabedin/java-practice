package com.java.algo;

public class Maximum {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 39, 40, 13 };
		int max = 0;
		int min = 0;
		arr[0] = Integer.MAX_VALUE;
		arr[0] = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}
