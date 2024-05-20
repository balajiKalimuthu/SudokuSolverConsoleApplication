package com.sudokusolver.datastorage;

// SUDOKU SOLVER APPLICATION DATA STORAGE PAGE

import com.sudokusolver.models.Credentials;
import com.sudokusolver.models.Game;

public class AppDataBase {
	private static AppDataBase dataBase;
	private int gameScore;

	private Credentials user = Credentials.getInstance();

	private AppDataBase() {
	}

	public static AppDataBase getInstance() {
		if (dataBase == null) {
			dataBase = new AppDataBase();
		}
		return dataBase;
	}

	public int getGameScore() {
		return gameScore;
	}

	public boolean checkAvaliableUser() {
		return user.getId() != null;
	}

	public void createCredentials(String name, String userId, String password, long phoneNo) {
		user.setName(name);
		user.setId(userId);
		user.setPassword(password);
		user.setPhoneNo(phoneNo);
	}

	public boolean checkUserID(String userId) {
		return user.getId().equals(userId);
	}

	public boolean checkUserPassword(String userId, String password) {
		return user.getId().equals(userId) && user.getPassword().equals(password);
	}

	public Game game3_01() {
		return Game_3X3.game01();
	}

	public int getCount3() {
		return Game_3X3.getGameCount();
	}

	public Game game4_01() {
		return Game_4X4.game01();
	}

	public int getCount4() {
		return Game_4X4.getGameCount();
	}

	public Game game9_01() {
		return Game_9X9.game01();
	}

	public Game game9_02() {
		return Game_9X9.game02();
	}

	public int getCount9() {
		return Game_9X9.getGameCount();
	}

	public int getPlayValue(Game game, int row, int col) {
		return game.playValue(row, col);
	}

	public int getAnswerValue(Game game, int row, int col) {
		return game.answerValue(row, col);
	}

	public int getMaxVal(Game game) {
		return game.getMaxVal();
	}

	public int getCount(Game game) {
		return game.getCount();
	}

	public int getMistake(Game game) {
		return game.getMistake();
	}

	public void display(Game game) {
		game.display();
	}

	public boolean checkValues(Game game, int row, int col, int value) {
		if ((row >= 1 && row <= game.getRowVal()) && (col >= 1 && col <= game.getColVal())
				&& (value >= 1 && value <= game.getMaxVal())) {
			return true;
		}
		return false;
	}

	public void setValue(Game game, int row, int col, int value) {
		game.setValue(row, col, value);
	}

	public void setGameScore(Game game, int mistake) {
		gameScore += game.getScore();
		if (mistake == 2) {
			gameScore -= 25;
		} else if (mistake == 1) {
			gameScore -= 50;
		} else if (mistake == 0) {
			gameScore -= game.getScore();
		}
	}
}