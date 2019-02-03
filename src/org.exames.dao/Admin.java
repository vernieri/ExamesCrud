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
	// Metodo para criar dados no db
	public int registerUser(String unome, String ucpf, String unota, String ucargo) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO STRUTS2CRUD VALUES (?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, unome);
			ps.setString(2, ucpf);
			ps.setString(3, unota);
			ps.setString(4, ucargo);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	// Metodo de busca de dados do candidato(usuario)
	public ResultSet report() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT UNAME,UCPF,UNOTA,UCARGO FROM STRUTS2CRUD";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
