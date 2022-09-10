package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClientOracle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
	
	System.out.println("Connected sucess");
	
	}

}
