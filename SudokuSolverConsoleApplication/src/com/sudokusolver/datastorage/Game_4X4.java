package com.sudokusolver.datastorage;

// SUDOKU SOLVER APPLICATION DATABASE - GAME 4 X 4 MATRIX PAGE

import com.sudokusolver.models.Game;

class Game_4X4 extends Game {
	private static int gameCount = 1;

	private Game_4X4(int row, int col, int[][] play, int[][] answer) {
		super(row, col, play, answer);
	}

	public static int getGameCount() {
		return gameCount;
	}

	public static Game_4X4 game01() {
		int answer[][] = { { 1, 4, 3, 2 }, { 4, 2, 1, 3 }, { 2, 3, 4, 1 }, { 3, 1, 2, 4 } };
		int play[][] = { { 0, 0, 3, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 3, 0, 2, 0 } };
		Game_4X4 game4 = new Game_4X4(4, 4, play, answer);
		game4.setCount(11);
		return game4;
	}
}