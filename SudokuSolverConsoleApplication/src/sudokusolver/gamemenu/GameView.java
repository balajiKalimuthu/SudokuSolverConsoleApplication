package sudokusolver.gamemenu;

// SUDOKU SOLVER APPLICATION GAME VIEW PAGE

import java.util.Scanner;

import sudokusolver.models.Game;

public class GameView {
	private Game game;
	private GameViewModel gameViewModel;
	private Scanner sc = new Scanner(System.in);

	public GameView() {
		gameViewModel = new GameViewModel(this);
	}

	public void init() {
		runGame();
	}

	private void runGame() {
		try {
			showMessage("\n\t+-----------------------------+\n");
			showMessage("\t|                             |\n");
			showMessage("\t|          GAME MENU          |\n");
			showMessage("\t|                             |\n");
			showMessage("\t+-----------------------------+\n");
			showMessage("\t| 1. Game 3X3                 |\n");
			showMessage("\t| 2. Game 4X4                 |\n");
			showMessage("\t| 3. Game 9X9                 |\n");
			showMessage("\t+-----------------------------+\n\n");

			showMessage("    Enter Your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				game_3X3();
				break;
			case 2:
				game_4X4();
				break;
			case 3:
				game_9X9();
				break;
			case 0:
				return;
			default:
				showMessage("\nPlease, Enter valid input to continue...\n\n");
			}
		} catch (Exception e) {
			showMessage("\nPlease, Enter valid input to continue...\n\n");
			sc.nextLine();
		}
	}

	private void game_3X3() {
		int choice, count, mistake, maxVal;
		showMessage("\n    Select Game No : 1 to " + gameViewModel.getCount3() + "\n");
		showMessage("    Enter Your Choice : ");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			game = gameViewModel.game3_01();
			count = gameViewModel.getCount(game);
			mistake = gameViewModel.getMistake(game);
			maxVal = gameViewModel.getMaxVal(game);
			startGame(game, count, mistake, maxVal);
			break;
		case 0:
			return;
		default:
			showMessage("\nPlease, Enter valid input to continue...\n\n");
		}
	}

	private void game_4X4() {
		int choice, count, mistake, maxVal;
		showMessage("\n    Select Game No : 1 to " + gameViewModel.getCount4() + "\n");
		showMessage("    Enter Your Choice : ");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			game = gameViewModel.game4_01();
			count = gameViewModel.getCount(game);
			mistake = gameViewModel.getMistake(game);
			maxVal = gameViewModel.getMaxVal(game);
			startGame(game, count, mistake, maxVal);
			break;
		case 0:
			return;
		default:
			showMessage("\nPlease, Enter valid input to continue...\n\n");
		}
	}

	private void game_9X9() {
		int choice, count, mistake, maxVal;
		showMessage("\n    Select Game No : 1 to " + gameViewModel.getCount9() + "\n");
		showMessage("    Enter Your Choice : ");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			game = gameViewModel.game9_01();
			count = gameViewModel.getCount(game);
			mistake = gameViewModel.getMistake(game);
			maxVal = gameViewModel.getMaxVal(game);
			startGame(game, count, mistake, maxVal);
			break;
		case 2:
			game = gameViewModel.game9_02();
			count = gameViewModel.getCount(game);
			mistake = gameViewModel.getMistake(game);
			maxVal = gameViewModel.getMaxVal(game);
			startGame(game, count, mistake, maxVal);
			break;
		case 0:
			return;
		default:
			showMessage("\nPlease, Enter valid input to continue...\n\n");
		}
	}

	private void startGame(Game game, int count, int mistake, int maxVal) {
		int row, col, value;
		boolean valid;
		while (count > 0 && mistake > 0) {
			try {
				showMessage("\n    Avaliable Chance - " + mistake + "/3\n");
				gameViewModel.display(game);
				showMessage("   Enter Row No : ");
				row = sc.nextInt();
				sc.nextLine();
				showMessage("   Enter Col No : ");
				col = sc.nextInt();
				sc.nextLine();
				showMessage("   Enter Value  : ");
				value = sc.nextInt();
				sc.nextLine();
				valid = gameViewModel.checkValues(game, row, col, value);
				if (!valid) {
					mistake--;
				} else {
					count--;
				}
			} catch (Exception e) {
				showMessage("\nInvalid Input - Value (1 to " + maxVal + ")\n");
				sc.nextLine();
				startGame(game, count, mistake, maxVal);
				return;
			}
		}
		showMessage("\n    Solved Sudoku - Mistakes : " + (3 - mistake) + "\n");
		gameViewModel.display(game);
		gameViewModel.setGameScore(game, mistake);
		showMessage("\nGame Score is added...\n\n");
	}

	public void showMessage(String message) {
		System.out.print(message);
	}
}