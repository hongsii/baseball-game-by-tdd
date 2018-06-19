package com.hongsi.baseballgame.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.hongsi.baseballgame.model.GameOption;

public class RandomNumberGenerator {


	public static final int MIN_RANDOM_NUMBER = 0;
	public static final int MAX_RANDOM_NUMBER = 9;

	private final List<Integer> numbers = IntStream.range(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER).boxed()
			.collect(Collectors.toList());

	public String generate(GameOption gameOption) {
		Collections.shuffle(numbers);
		StringBuilder randomNumber = new StringBuilder();
		for(int i = 0; i < gameOption.getRandomNumberSize(); i++) {
			randomNumber.append(numbers.get(i));
		}
		return randomNumber.toString();
	}
}
