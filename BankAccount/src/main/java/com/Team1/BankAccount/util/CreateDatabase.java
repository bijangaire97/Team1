package com.Team1.BankAccount.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static final String SQL = "create database account_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);

			System.out.println("db successfully created...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
