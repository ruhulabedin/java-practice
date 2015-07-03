package com.exception.java;

public class AgeCheck implements AgeChectInterface {

	@Override
	public void ageCheckForMarriage(int age) throws CustomException {

		if (age >= 18) {
			System.out.println("age is safe for work");
		}

		else {
			throw new CustomException(age + " age is not perfect for work");
		}
	}

}
