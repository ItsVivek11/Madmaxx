package cscorner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class sql
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
			String url = "jdbc:my sql://localhost/databasename";
		    String dbUser = "root";
			String dbPassword = "Vivek@00000";
			Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
			Statement stmt = con.createStatement();
			String sql= "select * from Traps";
			ResultSet rs = stmt.executeQuery(sql);
			String name;
			double val;
			java.sql.Date date;
			while (rs.next())
			{
			  name = rs.getString("TrapName");
			  val = rs.getDouble("TrapValue");
			  date = rs.getDate("TrapDate");
			  System.out.println("name = " + name + " Value = " + val + " Date = " + date);

		    }
			stmt.close();
			con.close();
		}
		catch(ClassNotFoundException ex1)
		{
			  System.out.println(ex1);
		}
		catch(SQLException ex2)
		{
			  System.out.println(ex2);
		}
	}
}
