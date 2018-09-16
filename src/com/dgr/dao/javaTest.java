package com.dgr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javaTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
		String USER = "root";
		String PASSWORD = "root";
		//1.load dirve
		/*Class.forName("com.mysql.jdbc.Driver");*/
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql 8.0 new dirve 
		//2.get database links
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
		System.out.println(conn);
	}
}
