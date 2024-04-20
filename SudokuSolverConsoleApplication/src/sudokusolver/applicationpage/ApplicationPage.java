package sudokusolver.applicationpage;

// SUDOKU SOLVER APPLICATION PAGE

import sudokusolver.mainmenu.MainMenuView;

public class ApplicationPage {
	private static ApplicationPage app;

	private String appName = "SUDOKU SOLVER APPLICATION";
	private String version = "VERSION - 0.0.1";

	public String getAppName() {
		return appName;
	}

	public String getVersion() {
		return version;
	}

	public void start() {
		init();
		MainMenuView mainMenuView = new MainMenuView();
		mainMenuView.init();
	}
	
	public void init() {
		app = ApplicationPage.getInstance();
		showMessage("\t+-----------------------------+\n");
		showMessage("\t|                             |\n");
		showMessage("\t|  " + appName + "  |\n");
		showMessage("\t|       " + version + "       |\n");
		showMessage("\t|                             |\n");
		showMessage("\t+-----------------------------+\n\n");
	}

	private ApplicationPage() {
	}

	public static ApplicationPage getInstance() {
		if (app == null) {
			app = new ApplicationPage();
		}
		return app;
	}
	
	public void showMessage(String message) {
		System.out.print(message);
	}
}