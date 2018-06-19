package com.hongsi.baseballgame.validator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class UserInputValidatorTest {

	private UserInputValidator userInputValidator;

	@Before
	public void setUp() {
		userInputValidator = new UserInputValidator();
	}

	@Test
	public void isValidRandomNumberSize() {
		boolean isValid = userInputValidator.isValidRandomNumberSize("4");
		assertThat(isValid).isTrue();
	}

	@Test
	public void isInvalidRandomNumberSize() {
		assertInvalidRandomNumberSize("2");
		assertInvalidRandomNumberSize("6");
		assertInvalidRandomNumberSize("문자를 입력하면 안돼요");
	}

	private void assertInvalidRandomNumberSize(String randomNumberSize) {
		boolean isValid = userInputValidator.isValidRandomNumberSize(randomNumberSize);
		assertThat(isValid).isFalse();
	}

	@Test
	public void isValidGuessNumber() {
		boolean isValid = userInputValidator.isValidGuessNumber(3, "123");
		assertThat(isValid).isTrue();
	}

	@Test
	public void isInvalidGuessNumber() {
		assertInvalidGuessNumber(3, "12");
		assertInvalidGuessNumber(3, "1234");
		assertInvalidGuessNumber(4, "123");
		assertInvalidGuessNumber(3, "숫자만 돼요");
	}

	private void assertInvalidGuessNumber(int randomNumberSize, String guessNumber) {
		boolean isValid = userInputValidator.isValidGuessNumber(randomNumberSize, guessNumber);
		assertThat(isValid).isFalse();
	}
}
