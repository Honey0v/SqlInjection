package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://semtle.catholic.ac.kr:3306/sqlInjection?useSSL=false",
				"sqlinjection",
				"sql"
		);

	}
}