package sudokusolver.datastorage;

// SUDOKU SOLVER APPLICATION DATABASE - GAME 9 X 9 MATRIX PAGE

import sudokusolver.models.Game;

class Game_9X9 extends Game {
	private static int gameCount = 2;

	private Game_9X9(int row, int col, int[][] play, int[][] answer) {
		super(row, col, play, answer);
	}

	public static int getGameCount() {
		return gameCount;
	}

	public static Game_9X9 game01() {
		int answer[][] = { { 1, 2, 9, 3, 8, 4, 7, 5, 6 }, { 7, 5, 8, 9, 2, 6, 3, 4, 1 }, { 3, 6, 4, 7, 1, 5, 8, 9, 2 },
				{ 5, 8, 1, 4, 3, 9, 6, 2, 7 }, { 4, 9, 7, 8, 6, 2, 1, 3, 5 }, { 6, 3, 2, 5, 7, 1, 9, 8, 4 },
				{ 2, 7, 5, 1, 9, 8, 4, 6, 3 }, { 9, 1, 6, 2, 4, 3, 5, 7, 8 }, { 8, 4, 3, 6, 5, 7, 2, 1, 9 } };
		int play[][] = { { 1, 2, 0, 3, 0, 4, 0, 5, 6 }, { 7, 0, 0, 0, 0, 6, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 0, 4, 0, 9, 0, 2, 0 }, { 0, 0, 0, 0, 6, 0, 0, 0, 0 }, { 0, 3, 0, 5, 0, 1, 0, 8, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 9, 0, 0, 2, 0, 0, 0, 0, 8 }, { 8, 4, 0, 6, 0, 7, 0, 1, 9 } };
		Game_9X9 game9 = new Game_9X9(9, 9, play, answer);
		game9.setCount(54);
		return game9;
	}

	public static Game_9X9 game02() {
		int answer[][] = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		int play[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 0, 0, 0, 0, 0 }, { 4, 0, 0, 0, 0, 0, 0, 0, 0 }, { 7, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 6, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 1, 9, 6, 3, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		Game_9X9 game9 = new Game_9X9(9, 9, play, answer);
		game9.setCount(58);
		return game9;
	}
}