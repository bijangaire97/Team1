package com.Team1.BankAccount.dao;

import com.Team1.BankAccount.model.User;

public interface Dao {
	int openAccount(User user);

	int withdrawAmount(User user);

	int depositAmount(User user);
}
