package com.java.stringoperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This program demonstrates how we can manipulate text
public class Regex6 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,"
				+ "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post"
				+ "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
		Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
		System.out.println(pattern.toString());
		Matcher matcher = pattern.matcher(str);
		String newStr = matcher.replaceAll("$1$2-$3$4");
		String [] splitArray = str.split(" ");
		for(String s:splitArray){
			System.out.println(s);
			count++;
		}
		System.out.println(count);
		System.out.println(newStr);
	}
}