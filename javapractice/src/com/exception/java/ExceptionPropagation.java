package com.exception.java;

import java.io.IOException;

public class ExceptionPropagation {

	public void methodOne() throws IOException {
		System.out.println("starting calling from methodOne");
		methodTwo();
	}

	public void methodTwo() throws IOException {
		System.out.println("In method methodTwo");
		methodThree();

	}

	public void methodThree() throws IOException {
		System.out.println("In method methodThee");
		throw new IOException();
	}

	public void methodFour() {
		System.out.println("In method methodFour");
	}

	public void methodFive() {
		System.out.println("In method methodFive");
	}

}
