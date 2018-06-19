package com.hongsi.baseballgame.validator;

public class UserInputValidator {

	public static final int MIN_RANDOM_NUMBER_SIZE = 3;
	public static final int MAX_RANDOM_NUMBER_SIZE = 5;

	private static final String RANDOM_NUMBER_SIZE_PATTERN = "^[" + MIN_RANDOM_NUMBER_SIZE + "-" + MAX_RANDOM_NUMBER_SIZE + "]{1}$";
	
	public boolean isValidRandomNumberSize(String input) {
		if(!input.matches(RANDOM_NUMBER_SIZE_PATTERN)) {
			System.out.println("유효하지 않은 입력입니다.");
			return false;
		}
		return true;
	}
}
