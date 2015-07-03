package com.java.stringoperation;

// This example demonstrates how to search a "region" of text within a string
public class MatchRegionInString {
	public static void main(String[] s) {
		String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n Jane: No thanks! I'mpreparing for OCPJP now!";
		String matchString = " Jane: No thanks!";
		// first get the index of the position from which the search region
		// starts
		int startIndex = chat.indexOf('\n');
		System.out
				.println("Jane's response starts at the index: " + startIndex);
		// if '\n' found, then try matching for the string " Jane: No thanks!"
		// from there
		if (startIndex > -1) {
			// remember that the index starts from 0 and not 1, so add 1 to
			// startIndex
			boolean doesMatch = chat.regionMatches(startIndex + 1, matchString,
					0, matchString.length());
			if (doesMatch)
				System.out.println("Jane's response matches with the string"
						+ matchString);
		}
	}
}