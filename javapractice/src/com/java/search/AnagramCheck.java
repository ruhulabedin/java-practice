package com.java.search;

import java.util.ArrayList;

public class AnagramCheck {
	public static void main(String args[]) {
		boolean foundLetter = false;
		String phrase1 = "i love u";
		phrase1 = (phrase1.toLowerCase()).trim();
		char[] phrase1Arr = phrase1.toCharArray();

		String phrase2 = "love y i";
		phrase2 = (phrase2.toLowerCase()).trim();
		ArrayList<Character> phrase2ArrList = convertStringToArraylist(phrase2);

		if (phrase1.length() != phrase2.length()) {
			System.out.print("There is no anagram present.");
		}

		for (int i = 0; i < phrase1Arr.length; i++) {
			for (int j = 0; j < phrase2ArrList.size(); j++) {
				if (phrase1Arr[i] == phrase2ArrList.get(j)) {
					foundLetter = true;
					phrase2ArrList.remove(j);
				}
			}

			if (!foundLetter) {
				System.out.println("not annargam");
				return;
			}

		}

		System.out.printf(phrase1 + " is a anargam of " + phrase2);
	}

	public static ArrayList<Character> convertStringToArraylist(String str) {
		ArrayList<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
		return charList;
	}
}