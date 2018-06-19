package com.hongsi.baseballgame.controller;

import com.hongsi.baseballgame.model.Result;

public class ResultController {

	private String randomNumber;

	private Result result;

	public ResultController(String randomNumber) {
		this.randomNumber = randomNumber;
		this.result = new Result();
	}

	public Result confirm(String guessNumber) {
		result.increaseGuessCount();
		for (int i = 0; i < guessNumber.length(); i++) {
			char guessDigit = guessNumber.charAt(i);

			if (guessDigit == randomNumber.charAt(i)) {
				result.correctStrike();
			} else if (randomNumber.indexOf(guessDigit) != -1) {
				result.correctBall();
			}
		}
		return result;
	}

	public boolean isAllMatch(int randomNumber) {
		result.printGuessResult();
		if(!result.isAllMatch(randomNumber)) {
			result.clearGuessResult();
			return false;
		}
		return true;
	}

	public void printGameResult() {
		System.out.println(randomNumber);
		System.out.println(result.getGuessCount());
	}
}
