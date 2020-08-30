package com.Team1.BankAccount;

import java.util.Scanner;

import com.Team1.BankAccount.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		UserController controller = new UserController();
		Scanner input = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("What do you want to do? openAccount| depositAmount | withdrawAmount");
			String choice = (input.nextLine()).toLowerCase();
			switch (choice) {
			case "openaccount":
				controller.openAccount(input);
				break;

			case "depositamount":
				controller.depositAmount(input);
				break;

			case "withdrawamount":
				controller.withdrawAmount(input);
				break;

			default:
				System.out.println("Invalid choice...");
				break;
			}
			System.out.println("Do you want to continue? ");
			decision = input.next();

		} while (decision.equalsIgnoreCase("yes"));
		System.out.println("Bye!! Have a good time!");

	}
}
