package com.Team1.BankAccount.uservice;

import com.Team1.BankAccount.dao.Dao;
import com.Team1.BankAccount.dao.DaoImpl2;
import com.Team1.BankAccount.model.User;

public class UServiceImpl2 implements UService {
	Dao userDao2 = new DaoImpl2();

	public int openAccount(User user) {
		return userDao2.openAccount(user);
	}

	@Override
	public int withdrawAmount(User user) {
		return userDao2.withdrawAmount(user);
	}

	@Override
	public int depositAmount(User user) {
		return userDao2.depositAmount(user);
	}
}
