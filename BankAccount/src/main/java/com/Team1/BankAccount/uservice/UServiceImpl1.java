package com.Team1.BankAccount.uservice;

import com.Team1.BankAccount.dao.Dao;
import com.Team1.BankAccount.dao.DaoImpl1;
import com.Team1.BankAccount.dao.DaoImpl2;
import com.Team1.BankAccount.model.User;

public class UServiceImpl1 implements UService {
	Dao userDao = new DaoImpl1();
	Dao userDao2 = new DaoImpl2();

	public int openAccount(User user) {
		return userDao.openAccount(user);
	}

	@Override
	public int withdrawAmount(User user) {
		return userDao.withdrawAmount(user);
	}

	@Override
	public int depositAmount(User user) {
		return userDao.depositAmount(user);
	}
}