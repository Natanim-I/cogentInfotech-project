package com.exception;

public class InvalidBookException extends RuntimeException{
	private String errorMessage;
	public InvalidBookException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}
