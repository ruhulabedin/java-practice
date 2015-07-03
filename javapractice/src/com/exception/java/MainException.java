package com.exception.java;

import java.io.IOException;

public class MainException {
	public static void main(String[] args) {
		ExceptionPropagation chainedException = new ExceptionPropagation();
		try {
			chainedException.methodOne();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
