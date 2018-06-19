package com.hongsi.baseballgame;

import com.hongsi.baseballgame.controller.GameController;

public class BaseballGame {
	
	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.init();
	}
}