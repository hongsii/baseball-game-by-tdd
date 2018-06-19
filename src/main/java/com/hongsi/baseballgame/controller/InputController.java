package com.hongsi.baseballgame.controller;

import java.io.IOException;
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

//	public int inputRandomNumberSize() {
//		int randomNumberSize;
//		boolean isNumber = false;
//		do {
//			printInputMessageForRandomNumberSize();
//			isNumber = scanner.hasNextInt();
//			if(!isNumber) {
//				System.out.println("숫자만 입력해주세요!");
//				scanner.next();
//				printInputMessageForRandomNumberSize();
//			}
//			randomNumberSize = scanner.nextInt();
//		} while(!userInputValidator.isValidRandomNumberSize(randomNumberSize));
//		return randomNumberSize;
//	}
	
	public int inputRandomNumberSize() {
		String randomNumberSize = "";
		do {
			printInputMessageForRandomNumberSize();
			randomNumberSize = scanner.next();
		} while(!userInputValidator.isValidRandomNumberSize(randomNumberSize));
		return Integer.parseInt(randomNumberSize);
	}


	private void printInputMessageForRandomNumberSize() {
		System.out.print("랜덤 숫자 개수 (" + UserInputValidator.MIN_RANDOM_NUMBER_SIZE + "-" + UserInputValidator.MAX_RANDOM_NUMBER_SIZE + ") : ");
	}
	
	
//	private boolean isValid
}
