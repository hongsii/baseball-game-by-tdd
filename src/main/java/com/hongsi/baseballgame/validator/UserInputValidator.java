package com.hongsi.baseballgame.validator;

import com.hongsi.baseballgame.controller.RandomNumberGenerator;

public class UserInputValidator {

	public static final int MIN_RANDOM_NUMBER_SIZE = 3;
	public static final int MAX_RANDOM_NUMBER_SIZE = 5;

	private static final String RANDOM_NUMBER_SIZE_PATTERN =
			"^[" + MIN_RANDOM_NUMBER_SIZE + "-" + MAX_RANDOM_NUMBER_SIZE + "]{1}$";

	public boolean isValidRandomNumberSize(String input) {
		if (!input.matches(RANDOM_NUMBER_SIZE_PATTERN)) {
			System.out.println("유효하지 않은 입력입니다!");
			return false;
		}
		return true;
	}

	public boolean isValidGuessNumber(int randomNumberSize, String guessNumber) {
		final String GUESS_NUMBER_PATTERN = makeGuessNumberPattern(randomNumberSize);
		if (!guessNumber.matches(GUESS_NUMBER_PATTERN)) {
			System.out.println("숫자 개수 또는 입력값이 유효하지 않습니다!");
			return false;
		}
		if(containsDuplicatedNumber(guessNumber)) {
			System.out.println("중복된 숫자가 있습니다!");
			return false;
		}
		return true;
	}

	private String makeGuessNumberPattern(int randomNumberSize) {
		return "^[" + RandomNumberGenerator.MIN_RANDOM_NUMBER + "-"
				+ RandomNumberGenerator.MAX_RANDOM_NUMBER + "]{" + randomNumberSize + "}$";
	}

	private boolean containsDuplicatedNumber(String guessNumber) {
		String uniqueNumber = guessNumber.chars().distinct()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		return guessNumber.length() != uniqueNumber.length();

	}
}
