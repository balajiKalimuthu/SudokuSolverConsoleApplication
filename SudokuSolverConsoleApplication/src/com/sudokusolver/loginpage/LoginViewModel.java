package com.sudokusolver.loginpage;

// SUDOKU SOLVER APPLICATION USER LOGIN MODEL PAGE - future update

import com.sudokusolver.datastorage.AppDataBase;
import com.sudokusolver.validator.ValueValidator;

public class LoginViewModel {
	private LoginView loginView;
	private AppDataBase dataBase = AppDataBase.getInstance();

	public LoginViewModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public boolean checkAvaliableUser() {
		return dataBase.checkAvaliableUser();
	}

	public void createCredentials(String name, String userId, String password, long phoneNo) {
		dataBase.createCredentials(name, userId, password, phoneNo);
		loginView.showMessage("\nUser ID created successfully...\n");
	}

	public boolean checkUserDetails(String userId, String password) {
		if (dataBase.checkUserID(userId)) {
			if (dataBase.checkUserPassword(userId, password)) {
				loginView.showMessage("\nUser login successfully...\n");
				return true;
			} else {
				loginView.showMessage("\nInvalid User Password...\n");
				loginView.showMessage("Please, Enter valid User ID and Password to login...\n");
			}
		} else {
			loginView.showMessage("\nInvalid User ID...\n");
			loginView.showMessage("Please, Enter valid User ID and Password to login...\n");
		}
		return false;
	}

	public boolean validName(String name) {
		if (ValueValidator.validateName(name)) {
			return true;
		} else {
			loginView.showMessage("  Name format must follows:\n");
			loginView.showMessage("   - contains only alphabets, '.', ' '\n");
			loginView.showMessage("   - length : 3 - 20\n");
			return false;
		}
	}

	public boolean validUserId(String userId) {
		if (ValueValidator.validateUserId(userId)) {
			return true;
		} else {
			loginView.showMessage("  User ID format must follows:\n");
			loginView.showMessage("   - contains only alphabets, digits, '@', '_'\n");
			loginView.showMessage("   - length : 5 - 15\n");
			return false;
		}
	}

	public boolean validPassword(String password) {
		if (ValueValidator.validatePassword(password)) {
			return true;
		} else {
			loginView.showMessage("  Password format must follows:\n");
			loginView.showMessage("   - contains atleast 1 alphabets\n");
			loginView.showMessage("   - contains atleast 1 digit\n");
			loginView.showMessage("   - contains atleast 1 letter '@' or '_'\n");
			loginView.showMessage("   - length : 8 - 15\n");
			return false;
		}
	}

	public boolean validPhoneNo(long phoneNo) {
		if (ValueValidator.validatePhoneNo(phoneNo)) {
			return true;
		} else {
			loginView.showMessage("  Phone Number format must follows:\n");
			loginView.showMessage("   - contains only digits\n");
			loginView.showMessage("   - length must be 10\n");
			return false;
		}
	}
}