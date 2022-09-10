package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
  static String driver="com.mysql.jdbc.Driver";
 static Connection con=null;
 static Statement st;
  static String conString="jdbc:mysql://localhost:3306/demo";
  static  String user="root";
  static String pass="1234";
  //static String query="delete from tblstudent where id=6 " ;
  static String query="update tblstudent set city='Hyd',dept='hr' where id=3 " ;

 //static String query="insert into tblstudent (id,name,city,Dept) values('priynka','sonipat','MCA')";
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName(driver);
			
				con=DriverManager.getConnection(conString,user,pass);
				st=con.createStatement();
				
				st.executeUpdate(query);
				System.out.println("Record updated  sucessfully");
				
			} catch (SQLException e) {
				
			
			}
		catch (ClassNotFoundException e) {
			
		}
		finally {
			con.close();
			System.out.print(" Connection close");
		}

	}

}
