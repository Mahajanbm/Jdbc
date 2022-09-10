package com.demo.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("ids.sql.IDSDriver");
		Connection  connection =DriverManager.getConnection("jdbc:ids://127.0.0.1:12/conn?dsn=abcd","system","1234");
		System.out.println("Connection Done");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select id ,name from tblemp");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2));
		}
		
		
		
		
	}

}
