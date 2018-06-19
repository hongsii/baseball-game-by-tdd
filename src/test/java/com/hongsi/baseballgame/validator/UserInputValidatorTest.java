package com.hongsi.baseballgame.validator;

import static org.assertj.core.api.Assertions.*;

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
	public void isInvalidRandomNumberSize() throws Exception {
		assertInvalidRandomNumberSize("2");
		assertInvalidRandomNumberSize("6");
		assertInvalidRandomNumberSize("문자가 들어가면 안돼요");
	}

	private void assertInvalidRandomNumberSize(String randomNumberSize) {
		boolean isValid = userInputValidator.isValidRandomNumberSize(randomNumberSize);
		assertThat(isValid).isFalse();
	}
}
