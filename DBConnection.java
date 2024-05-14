package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con = null;
	static Connection get()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","2101020733");
			return con;

		}
		catch(Exception e)
		{
			System.out.println("exception::"+e);
			return null;
		}
		
	}
	

}
