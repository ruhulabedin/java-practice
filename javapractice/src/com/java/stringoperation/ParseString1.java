package com.java.stringoperation;

public class ParseString1 {
	public static void main(String[] s) {
		String quote = "Never lend books-nobody ever returns them!";
		String[] words = quote.split(" "); // split strings based on the
											// delimiter " "
		for (String word : words) {
			System.out.println(word);
		}
	}
}