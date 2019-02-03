package org.exames.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	
	// Metodo para criar conexao com o db
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exames", "root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
