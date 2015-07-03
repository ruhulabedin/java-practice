package com.java.stringoperation;

// This example demonstrates how to search multiple occurences of a search string
public class SearchString3 {
	public static void main(String[] s) {
		String str = "I am a student. I am preparing for OCPJP";
		int fromIndex = 0;
		while (str.indexOf("am", fromIndex) > -1) {
			fromIndex = str.indexOf("am", fromIndex);
			System.out
					.println("Substring \"am\" occurs at index: " + fromIndex);
			fromIndex++;
		}
	}
}