package sudokusolver.datastorage;

// SUDOKU SOLVER APPLICATION DATABASE - GAME 3 X 3 MATRIX PAGE

import sudokusolver.models.Game;

class Game_3X3 extends Game {
	private static int gameCount = 1;

	private Game_3X3(int row, int col, int[][] play, int[][] answer) {
		super(row, col, play, answer);
	}

	public static int getGameCount() {
		return gameCount;
	}
	
	public static Game_3X3 game01() {
		int answer[][] = {{1,3,2},
				          {3,2,1},
				          {2,1,3}};
		int play[][] = {{1,0,0},
		          		{0,2,0},
		          		{0,0,3}};
		Game_3X3 game3 = new Game_3X3(3,3,play,answer);
		game3.setCount(6);
		return game3;
	}
}