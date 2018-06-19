package com.hongsi.baseballgame.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class ResultTest {

	@Test
	public void printGuessResult() {
		assertGuessResult(1, 1, "결과 : 1S1B");
		assertGuessResult(1, 0, "결과 : 1S");
		assertGuessResult(0, 1, "결과 : 1B");
		assertGuessResult(3, 0, "결과 : 3S");
		assertGuessResult(0, 3, "결과 : 3B");
		assertGuessResult(0, 0, "결과 : Out");
	}

	private void assertGuessResult(int strikeCount, int ballCount, String expected) {
		Result result = new Result();

		for(int i = 0; i < strikeCount; i++) {
			result.correctStrike();
		}
		for(int i = 0; i < ballCount; i++) {
			result.correctBall();
		}

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		result.printGuessResult();

		assertThat(outContent.toString().trim()).isEqualTo(expected);
	}

	@Test
	public void isAllMatch() {
		assertAllMatch(3);
		assertAllMatch(4);
		assertAllMatch(5);
	}

	private void assertAllMatch(int randomNumberSize) {
		Result result = new Result();

		for(int i = 0; i <  randomNumberSize; i++) {
			result.correctStrike();
		}

		assertThat(result.isAllMatch( randomNumberSize)).isTrue();
	}
}