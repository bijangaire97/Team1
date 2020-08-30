package com.Team1.BankAccount.uservice;

import com.Team1.BankAccount.model.User;

public interface UService {
	int openAccount(User user);

	int withdrawAmount(User user);

	int depositAmount(User user);
}
