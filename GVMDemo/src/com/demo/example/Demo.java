package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
	public void Demo()
	{
			String driver="com.mysql.cj.jdbc.Driver";
			String constring="jdbc:mysql://127.0.0.1:3306/Demo";
		    String user="root";
		    String pass="1234";
			
				//Client c1=new Client();
				try {	
				Class.forName(driver);
				Connection con=DriverManager.getConnection(constring,user,pass);
				System.out.println("connecton done");
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select id,name,City,dept from tblstudent order by name");//selection fetch data from table
		while(rs.next())
		{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4));
				
		}	
			
					
				} catch (Exception e) {
				System.out.println("Error");
				}
				finally {
					
				}
			
			
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Demo d1=new Demo();
d1.Demo();
	}

}
