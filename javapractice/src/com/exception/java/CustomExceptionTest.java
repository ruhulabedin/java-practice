package com.exception.java;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
		AgeChectInterface ageChectInterface = new AgeCheck();
		try {
			ageChectInterface.ageCheckForMarriage(10);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
