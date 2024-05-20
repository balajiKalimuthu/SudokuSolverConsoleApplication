package com.sudokusolver;

// SUDOKU SOLVER APPLICATION HOME

import com.sudokusolver.applicationpage.ApplicationPage;

public class Home {
	public static void main(String[] args) {
		ApplicationPage app = ApplicationPage.getInstance();
		app.start();
	}
}