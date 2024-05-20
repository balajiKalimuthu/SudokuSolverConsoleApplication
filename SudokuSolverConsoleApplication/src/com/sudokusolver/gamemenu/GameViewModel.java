package com.sudokusolver.gamemenu;

// SUDOKU SOLVER APPLICATION GAME MODEL PAGE

import com.sudokusolver.datastorage.AppDataBase;
import com.sudokusolver.models.Game;

public class GameViewModel {
	private AppDataBase dataBase = AppDataBase.getInstance();
	private GameView gameView;
	private int playValue, answerValue;

	public GameViewModel(GameView gameView) {
		this.gameView = gameView;
	}

	public Game game3_01() {
		return dataBase.game3_01();
	}

	public int getCount3() {
		return dataBase.getCount3();
	}

	public Game game4_01() {
		return dataBase.game4_01();
	}

	public int getCount4() {
		return dataBase.getCount4();
	}

	public Game game9_01() {
		return dataBase.game9_01();
	}

	public Game game9_02() {
		return dataBase.game9_02();
	}

	public int getCount9() {
		return dataBase.getCount9();
	}

	public int getCount(Game game) {
		return dataBase.getCount(game);
	}

	public int getMistake(Game game) {
		return dataBase.getMistake(game);
	}

	public int getMaxVal(Game game) {
		return dataBase.getMaxVal(game);
	}

	public void display(Game game) {
		dataBase.display(game);
	}

	public boolean checkValues(Game game, int row, int col, int value) {
		if (dataBase.checkValues(game, row, col, value)) {
			playValue = dataBase.getPlayValue(game, row, col);
			if (playValue == 0) {
				answerValue = dataBase.getAnswerValue(game, row, col);
				if (value == answerValue) {
					dataBase.setValue(game, row, col, value);
				} else {
					gameView.showMessage("\nMistake occured...\n");
					return false;
				}
			} else {
				gameView.showMessage("\nInvalid Move...\n");
			}
		} else {
			gameView.showMessage("\nInvalid Move...\n");
		}
		return true;
	}

	public void setGameScore(Game game, int mistake) {
		dataBase.setGameScore(game, mistake);
	}
}