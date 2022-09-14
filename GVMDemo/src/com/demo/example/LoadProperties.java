package com.demo.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class LoadProperties {
static String queryString="insert into tblstudent(id) values(?)";
	
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Mahi\\git\\repository\\GVMDemo\\src\\db.properties");
Properties p1=new Properties();
p1.load(fileInputStream);

String driver=p1.getProperty("driver");
String Constring=p1.getProperty("Constring");
String user=p1.getProperty("user");
String passString=p1.getProperty("password");

Class.forName(driver);
Connection connection=DriverManager.getConnection(Constring,user,passString);


PreparedStatement ps=connection.prepareStatement(queryString);

ps.setInt(1, 103);
ps.executeUpdate();
System.out.println("record inserted");








	}

}
