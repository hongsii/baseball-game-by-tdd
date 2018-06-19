package com.hongsi.baseballgame.controller;

import com.hongsi.baseballgame.model.GameOption;
import java.util.Scanner;

import com.hongsi.baseballgame.validator.UserInputValidator;

public class InputController {

	private final Scanner scanner;
	private UserInputValidator userInputValidator;
	
	public InputController() {
		this(new Scanner(System.in));
	}

	public InputController(Scanner scanner) {
		this.scanner = scanner;
		this.userInputValidator = new UserInputValidator();
	}

	public int inputRandomNumberSize() {
		String randomNumberSize;
		do {
			System.out.print("랜덤 숫자 개수 (" + UserInputValidator.MIN_RANDOM_NUMBER_SIZE + "-" + UserInputValidator.MAX_RANDOM_NUMBER_SIZE + ") : ");
			randomNumberSize = scanner.next();
		} while(!userInputValidator.isValidRandomNumberSize(randomNumberSize));
		return Integer.parseInt(randomNumberSize);
	}

	public String guessNumber(GameOption gameOption) {
		String guessNumber;
		do {
			System.out.print("번호 입력 : ");
			guessNumber = scanner.next();
		} while(!userInputValidator.isValidGuessNumber(gameOption.getRandomNumberSize(), guessNumber));
		return guessNumber;
	}
}
