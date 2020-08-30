package com.Team1.BankAccount.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Team1.BankAccount.model.User;
import com.Team1.BankAccount.util.DBUtil;

public class DaoImpl2 implements Dao {

	public static final String INSERT_SQl = "insert into acc_info_tbl(unique_id,account_name,address,mobileNo)values(?,?,?,?)";

	@Override
	public int openAccount(User user) {

		int saved = 0;
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_SQl);) {

			ps.setLong(1, user.getUnique_id());
			ps.setString(2, user.getUser_name());
			ps.setString(3, user.getAddress());
			ps.setLong(4, user.getMobileNo());
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
