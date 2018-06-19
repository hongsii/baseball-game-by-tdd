package com.hongsi.baseballgame.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.hongsi.baseballgame.model.GameOption;
import java.io.ByteArrayInputStream;
import org.junit.Before;
import org.junit.Test;

public class InputControllerTest {

	private GameOption gameOption;

	@Before
	public void setUp() {
		gameOption = new GameOption(3);
	}

	@Test
	public void inputRandomNumberSize() {
		ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
		System.setIn(in);

		InputController inputController = new InputController();

		int randomNumberSize = inputController.inputRandomNumberSize();

		assertThat(randomNumberSize).isEqualTo(3);
	}

	@Test
	public void guessNumber() {
		String userInput = "312";
		ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(in);

		InputController inputController = new InputController();

		String guessNumber = inputController.guessNumber(gameOption);

		assertThat(guessNumber).isNotEmpty().isEqualTo(userInput);
	}
}
