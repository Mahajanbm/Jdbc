package com.demo.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class GvmDemo {
	  static String driver="com.mysql.jdbc.Driver";
	  static Connection con=null;
	  static Statement st;
	   static String conString="jdbc:mysql://localhost:3306/demo";
	   static  String user="root";
	   static String pass="1234";
	public static void main(String[] args) {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(conString,user,pass);
			st=con.createStatement();
			
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enetr Student Id");
			int id=scanner.nextInt();
			System.out.print("Enetr Student Name");
			String name=scanner.next();
			System.out.print("Enetr Student city");
			String city=scanner.next();
			System.out.print("Enetr Student Dept");
			String Dept=scanner.next();
		String queryString=String.format("insert into tblstudent values(%d,'%s','%s','%s')",id,name,city,Dept);
	    st.executeUpdate(queryString);
			System.out.println("Record inserted");
	    
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
