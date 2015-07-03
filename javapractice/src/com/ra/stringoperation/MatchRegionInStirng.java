package com.ra.stringoperation;

public class MatchRegionInStirng {
	public static void main(String[] args) {
		boolean doesMatch = false;
		String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n Jane: No thanks! I'm "
				+ "preparing for OCPJP now!";

		String match = " Jane: No thanks!";
		int startIndex = chat.indexOf('\n');
        System.out.println(startIndex);
		while (startIndex > -1) {
			doesMatch = chat.regionMatches(startIndex + 1, match, 0,
					match.length());
			//System.out.println("doesMatch"+doesMatch);
		}

		if (doesMatch) {
			System.out.println("string find");
		}
	}
}
