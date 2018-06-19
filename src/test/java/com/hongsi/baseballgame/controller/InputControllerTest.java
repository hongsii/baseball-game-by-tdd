package com.hongsi.baseballgame.controller;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class InputControllerTest {

	@Test
	public void inputRandomNumberSize() {
		ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
		System.setIn(in);

		InputController inputController = new InputController();

		int randomNumberSize = inputController.inputRandomNumberSize();

		assertThat(randomNumberSize).isEqualTo(3);
	}
}
