package com.hongsi.baseballgame.model;

public class Result {

	private int strike;
	private int ball;
	private int guessCount;

	public Result() {
		clearGuessResult();
	}

	public void correctStrike() {
		strike++;
	}

	public void correctBall() {
		ball++;
	}

	public void increaseGuessCount() {
		guessCount++;
	}

	public int getGuessCount() {
		return guessCount;
	}

	public boolean isAllMatch(int randomNumberSize) {
		return strike == randomNumberSize;
	}

	public void printGuessResult() {
		StringBuilder result = new StringBuilder("결과 : ");
		if (strike == 0 && ball == 0) {
			result.append("Out");
		} else {
			if (strike > 0) {
				result.append(getStrikeResult());
			}
			if (ball > 0) {
				result.append(getBallResult());
			}
		}
		System.out.println(result.toString());
	}

	private String getStrikeResult() {
		return strike + "S";
	}

	private String getBallResult() {
		return ball + "B";
	}

	public void clearGuessResult() {
		strike = 0;
		ball = 0;
	}
}
