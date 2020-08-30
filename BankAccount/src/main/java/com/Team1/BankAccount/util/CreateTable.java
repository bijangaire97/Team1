package com.Team1.BankAccount.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
	public static final String SQL1 = "create table acc_balance_tbl(unique_id int not null, withdraw_amount double, deposit_amount double, balance_amount double, primary key(unique_id))";

	public static void main(String[] args) {
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps1 = con.prepareStatement(SQL1);

		) {
			ps1.executeUpdate();

			System.out.println("table created");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
