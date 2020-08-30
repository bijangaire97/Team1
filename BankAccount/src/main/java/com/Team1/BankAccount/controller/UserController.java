package com.Team1.BankAccount.controller;

import java.util.Scanner;

import com.Team1.BankAccount.model.User;
import com.Team1.BankAccount.uservice.UService;
import com.Team1.BankAccount.uservice.UServiceImpl1;
import com.Team1.BankAccount.uservice.UServiceImpl2;

public class UserController {

	UService us = new UServiceImpl1();
	UService us2 = new UServiceImpl2();

	public void openAccount(Scanner input) {
		User user = getUserData(input);
		int saved = us.openAccount(user);
		int saved2 = us2.openAccount(user);

		if ((saved >= 1) && (saved2 >= 1)) {
			System.out.println("account opened successfully!!!");
		} else {
			System.out.println("error while opening account.");
		}
	}

	public void withdrawAmount(Scanner input) {
		User user = getUserData(input);
		System.out.println("Enter the amount of money withdrawn: ");
		double withdraw_Amount = input.nextDouble();
		user.setWithdraw_amount(withdraw_Amount);

		int saved = us.withdrawAmount(user);
		if (saved >= 1) {
			System.out.println("amount withdrawn successfully!!!");
		} else {
			System.out.println("error while withdrawing amount.");
		}

	}

	public void depositAmount(Scanner input) {
		User user = getUserData(input);
		System.out.println("Enter the amount of money deposited: ");
		double depositAmount = input.nextDouble();
		user.setDeposit_amount(depositAmount);

		int saved = us.depositAmount(user);
		if (saved >= 1) {
			System.out.println("amount deposited successfully!!!");
		} else {
			System.out.println("error while depositing.");
		}
	}

	private User getUserData(Scanner input) {
		User user1 = new User();
		System.out.println("Enter the username: ");
		String user_name = input.nextLine();
		System.out.println("Enter the address: ");
		String address = input.nextLine();
		System.out.println("Enter mobile number: ");
		long mobileNo = input.nextLong();
		System.out.println("Enter your ID number: ");
		long unique_id = input.nextLong();

		user1.setUser_name(user_name);
		user1.setAddress(address);
		user1.setMobileNo(mobileNo);
		user1.setUnique_id(unique_id);
		return user1;
	}
}
