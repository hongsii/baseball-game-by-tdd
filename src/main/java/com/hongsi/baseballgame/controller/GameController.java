package com.hongsi.baseballgame.controller;

import com.hongsi.baseballgame.model.GameOption;

public class GameController {

	private final InputController inputController;
	private final RandomNumberGenerator randomNumberGenerator;

	private GameOption gameOption;

	public GameController() {
		inputController = new InputController();
		randomNumberGenerator = new RandomNumberGenerator();
	}

	public void init() {
		gameOption = new GameOption(inputController.inputRandomNumberSize());
		String randomNumber = randomNumberGenerator.generate(gameOption);
		System.out.println(randomNumber);
	}
}
