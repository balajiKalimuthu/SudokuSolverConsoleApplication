package sudokusolver.loginpage;

// SUDOKU SOLVER APPLICATION USER LOGIN VIEW PAGE - future update

import java.util.Scanner;

import sudokusolver.mainmenu.MainMenuView;

public class LoginView {
	private LoginViewModel loginViewModel;
	private Scanner sc = new Scanner(System.in);

	private String name, userId, password;
	private long phoneNo;
	private boolean valid;

	public LoginView() {
		loginViewModel = new LoginViewModel(this);
	}

	public void init() {
		proceedLogin();
	}

	private void proceedLogin() {
		while (true) {
			try {
				showMessage("\n\t+-----------------------------+\n");
				showMessage("\t|                             |\n");
				showMessage("\t|   APPLICATION LOGIN PAGE    |\n");
				showMessage("\t|                             |\n");
				showMessage("\t+-----------------------------+\n");
				showMessage("\t| 1. Login User               |\n");
				showMessage("\t| 0. Exit                     |\n");
				showMessage("\t+-----------------------------+\n\n");

				showMessage("    Enter Your Choice : ");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					if (!loginViewModel.checkAvaliableUser()) {
						createNewUser();
					}
					openOldUser();
					break;
				case 0:
					return;
				default:
					showMessage("\nPlease, Enter valid input to continue...\n\n");
				}
			} catch (Exception e) {
				showMessage("\nPlease, Enter valid input to continue...\n\n");
				sc.nextLine();
				proceedLogin();
			}
		}
	}

	public void showMessage(String message) {
		System.out.print(message);
	}

	private void createNewUser() {
		valid = false;
		showMessage("\nPlease, Enter your details to create User ID...\n");
		while (!valid) {
			showMessage("  Enter Name      : ");
			name = sc.nextLine();
			valid = loginViewModel.validName(name);
		}
		do {
			showMessage("  Enter User Id   : ");
			userId = sc.nextLine();
			valid = loginViewModel.validUserId(userId);
		} while (!valid);
		do {
			showMessage("  Enter Password  : ");
			password = sc.nextLine();
			valid = loginViewModel.validPassword(password);
		} while (!valid);

		do {
			showMessage("  Enter Phone No  : ");
			phoneNo = sc.nextLong();
			valid = loginViewModel.validPhoneNo(phoneNo);
		} while (!valid);
		loginViewModel.createCredentials(name, userId, password, phoneNo);
	}

	private void openOldUser() {
		showMessage("\nPlease, Enter your details to login...\n");
		showMessage("  Enter User Id   : ");
		userId = sc.nextLine();
		showMessage("  Enter Password  : ");
		password = sc.nextLine();
		valid = loginViewModel.checkUserDetails(userId, password);
		if (valid) {
			new MainMenuView().init();
		}
	}
}