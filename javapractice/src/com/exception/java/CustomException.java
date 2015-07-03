package com.exception.java;

public class CustomException extends Exception {
	private String exMessage;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String exMessage) {
		super(exMessage);
		this.exMessage = exMessage;
	}

}
