package com.hongsi.baseballgame.controller;

import static org.junit.Assert.*;

import com.hongsi.baseballgame.model.Result;
import org.junit.Test;

public class ResultControllerTest {

	@Test
	public void confirm() {
		ResultController resultController = new ResultController("123");

		Result result = resultController.confirm("821");
	}
}