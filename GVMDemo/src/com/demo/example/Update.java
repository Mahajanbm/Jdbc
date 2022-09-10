package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
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
			System.out.print("Enetr Student Id ");
			int id=scanner.nextInt();
			
			System.out.print("Enetr Student Dept ");
			String Dept=scanner.next();
			//System.out.print("Enetr Student city ");
			//String city=scanner.next();
			String update=String.format("update tblstudent set dept='%s' where id=%d",Dept,id);
		//String queryString=String.format("delete from tblstudent where id=%d",id);
	    st.executeUpdate(update);
			System.out.println("Record updated");
	    
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
