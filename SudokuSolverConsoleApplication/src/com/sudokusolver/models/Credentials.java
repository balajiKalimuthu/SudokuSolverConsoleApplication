package com.sudokusolver.models;

// SUDOKU SOLVER APPLICATION MODEL - CREDENTIALS PAGE - future update

public class Credentials {
	private static Credentials user;

	private String name;
	private String id;
	private String password;
	private long phoneNo;

	public static Credentials getInstance() {
		if (user == null) {
			user = new Credentials();
		}
		return user;
	}

	private Credentials() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}