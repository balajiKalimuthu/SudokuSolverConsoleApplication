package com.sudokusolver.validator;

// SUDOKU SOLVER APPLICATION VALUE VALIDATOR PAGE - future update

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueValidator {
	private static Matcher matcher;
	private static Pattern pattern;
	private static String regex;

	public static boolean validateName(String name) {
		regex = "^[A-Za-z .]{3,20}";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name);
		return matcher.matches();
	}

	public static boolean validateUserId(String userId) {
		regex = "^[A-Za-z0-9@_]{5,15}";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(userId);
		return matcher.matches();
	}

	public static boolean validatePassword(String password) {
		regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@_])[A-Za-z0-9@_]{8,15}";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static boolean validatePhoneNo(long phoneNo) {
		if (phoneNo > 999999999L && phoneNo <= 10000000000L) {
			return true;
		}
		return false;
	}
}