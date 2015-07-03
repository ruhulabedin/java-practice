package com.javapractice.exception;

public class AgeExceptionTest {
	public static void validTestForMarriage(int marriageAge) {
		if (marriageAge <= 18) {
			throw new InvalidAgeException("Marriage Age Eception");
		}

		else {
			System.out.println("proper age for marriage");
		}
	}

	public static void main(String[] args) {

		try {
			validTestForMarriage(17);
		}

		catch (Exception m) {
			System.out.println("Exception occured: Age is less than 18 " + m);
			m.printStackTrace();
		}

	}

}
