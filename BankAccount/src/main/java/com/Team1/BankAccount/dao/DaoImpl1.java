package com.Team1.BankAccount.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Team1.BankAccount.model.User;
import com.Team1.BankAccount.util.DBUtil;

public class DaoImpl1 implements Dao {
	public static final String INSERT_SQl = "insert into acc_balance_tbl(unique_id, deposit_amount, withdraw_amount,balance_amount)values(?,?,?,?)";

	@Override
	public int openAccount(User user) {

		int saved = 0;
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_SQl);) {

			ps.setLong(1, user.getUnique_id());
			ps.setDouble(2, user.getDeposit_amount());
			ps.setDouble(3, user.getWithdraw_amount());
			ps.setDouble(4, user.getBalance());

			saved = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return saved;
	}

	@Override
	public int withdrawAmount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int depositAmount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
