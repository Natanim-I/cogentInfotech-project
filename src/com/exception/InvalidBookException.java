package com.exception;
/**
 * @author : Natanim
 *
 * @date : Feb 1, 2023
 * 
 * @Description : A user defined exception class to show error messages and throw exceptions 
 * 
 */

public class InvalidBookException extends RuntimeException{
	private String errorMessage;
	public InvalidBookException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}
