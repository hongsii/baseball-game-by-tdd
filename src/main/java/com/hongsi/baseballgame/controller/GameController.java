package com.hongsi.baseballgame.controller;

import com.hongsi.baseballgame.model.GameOption;
import com.hongsi.baseballgame.model.Result;

public class GameController {

	private final InputController inputController;
	private final RandomNumberGenerator randomNumberGenerator;

	private GameOption gameOption;
	private ResultController resultController;

	public GameController() {
		inputController = new InputController();
		randomNumberGenerator = new RandomNumberGenerator();
	}

	public void init() {
		gameOption = new GameOption(inputController.inputRandomNumberSize());
		resultController = new ResultController(randomNumberGenerator.generate(gameOption));

		start();
	}

	private void start() {
		do {
			resultController.confirm(inputController.guessNumber(gameOption));
		} while(!resultController.isAllMatch(gameOption.getRandomNumberSize()));

		resultController.printGameResult();
	}
}
