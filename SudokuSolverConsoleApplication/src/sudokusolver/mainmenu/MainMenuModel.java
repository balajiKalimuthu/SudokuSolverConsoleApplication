package sudokusolver.mainmenu;

import sudokusolver.datastorage.AppDataBase;

public class MainMenuModel {
	private AppDataBase dataBase = AppDataBase.getInstance();
	private MainMenuView mainMenuView;

	public MainMenuModel(MainMenuView mainMenuView) {
		this.mainMenuView = mainMenuView;
	}

	public void getScore() {
		mainMenuView.showMessage("\n    Game Score : " + dataBase.getGameScore() +"\n\n");
	}
}