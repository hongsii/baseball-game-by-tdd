package com.hongsi.baseballgame.model;

/**
 * 게임에서 사용하는 옵션
 * 1. 정답 숫자 개수
 * @TODO 사용자수 제한
 */
public class GameOption {
	
	private int randomNumberSize;

	public GameOption(int randomNumberSize) {
		this.randomNumberSize = randomNumberSize;
	}
	
	public int getRandomNumberSize() {
		return randomNumberSize;
	}
}
