package com.sudokusolver.mainmenu;

// SUDOKU SOLVER APPLICATION MAIN MENU PAGE

import java.util.Scanner;

import com.sudokusolver.applicationpage.ApplicationPage;
import com.sudokusolver.gamemenu.GameView;

public class MainMenuView {
	private ApplicationPage app = ApplicationPage.getInstance();
	private MainMenuViewModel mainMenuViewModel;
	private Scanner sc = new Scanner(System.in);

	public MainMenuView() {
		mainMenuViewModel = new MainMenuViewModel(this);
	}

	public void init() {
		while (true) {
			try {
				showMessage("\t+-----------------------------+\n");
				showMessage("\t|                             |\n");
				showMessage("\t|          MAIN MENU          |\n");
				showMessage("\t|                             |\n");
				showMessage("\t+-----------------------------+\n");
				showMessage("\t| 1. Game Score               |\n");
				showMessage("\t| 2. New Game                 |\n");
				showMessage("\t| 0. Exit                     |\n");
				showMessage("\t+-----------------------------+\n\n");

				showMessage("    Enter Your Choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					mainMenuViewModel.getScore();
					break;
				case 2:
					new GameView().init();
					break;
				case 0:
					end();
					return;
				default:
					showMessage("\nPlease, Enter valid input to continue...\n\n");
				}
			} catch (Exception e) {
				showMessage("\nPlease, Enter valid input to continue...\n\n");
				sc.nextLine();
				init();
				return;
			}
		}
	}

	private void end() {
		showMessage("\n\nx-x-x-x- THANKS FOR USING " + app.getAppName() + " -x-x-x-x\n\n");
	}

	public void showMessage(String message) {
		System.out.print(message);
	}
}