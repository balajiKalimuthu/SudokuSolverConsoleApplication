package sudokusolver.mainmenu;

import sudokusolver.datastorage.AppDataBase;

public class MainMenuViewModel {
	private AppDataBase dataBase = AppDataBase.getInstance();
	private MainMenuView mainMenuView;

	public MainMenuViewModel(MainMenuView mainMenuView) {
		this.mainMenuView = mainMenuView;
	}

	public void getScore() {
		mainMenuView.showMessage("\n    Game Score : " + dataBase.getGameScore() + "\n\n");
	}
}