package com.Team1.BankAccount.model;

public class User {
	private String user_name;
	private String address;
	private long mobileNo;
	private long unique_id;
	private double deposit_amount;
	private double withdraw_amount;
	private double balance;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(long unique_id) {
		this.unique_id = unique_id;
	}

	public double getDeposit_amount() {
		return deposit_amount;
	}

	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}

	public double getWithdraw_amount() {
		return withdraw_amount;
	}

	public void setWithdraw_amount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
