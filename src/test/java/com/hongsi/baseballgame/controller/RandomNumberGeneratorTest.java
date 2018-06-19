package com.hongsi.baseballgame.controller;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.hongsi.baseballgame.model.GameOption;

public class RandomNumberGeneratorTest {

	@Test
	public void generate() {
		RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

		GameOption gameOption = new GameOption(3);

		String randomNumber = randomNumberGenerator.generate(gameOption);

		assertThat(randomNumber.length()).isEqualTo(3);
		assertThat(containsDuplicatedNumber(randomNumber)).isTrue();
	}

	private boolean containsDuplicatedNumber(String randomNumber) {
		String uniqueNumber = randomNumber.chars().distinct()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		return uniqueNumber.length() == randomNumber.length();
	}
}
