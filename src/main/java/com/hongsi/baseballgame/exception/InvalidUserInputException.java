package com.hongsi.baseballgame.exception;

public class InvalidUserInputException extends RuntimeException {
	
	private final String errorCode = "user.input.invalid";
	
	public InvalidUserInputException() {
		super();
	}
	
	public InvalidUserInputException(String message) {
		super(message);
	}
	
	public String getErrorCode() {
		return errorCode;
	}
}
