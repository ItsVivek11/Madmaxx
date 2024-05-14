package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//make printwriter ready
		//read html data
		/* try
		 * { connect to databse
		 * prepare query
		 * execute query
		 * if (success)
		 * {
		 *   record inserted do any other transactions
		 *   include(success.html)
		 *  }
		 *  else
		 *  {
		 *  insertion failed
		 *  include create.html
		 *  }
		 *  }
		 *  catch
		 *  {
		 *  print error message
		 *  }
		 *  }
		 */
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        int num= Integer.parseInt(request.getParameter("num"));
		String name =request.getParameter("name");
		int balance= Integer.parseInt(request.getParameter("balance"));
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","2101020733");
			Statement st=conn.createStatement();
			String query = "insert into account values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,num);
			ps.setString(2, name);
			ps.setInt(3, balance);
			int count = ps.executeUpdate();
			if(count>0)
			{
				out.println("<h2>Record Inserted -Do Any Other Transactions</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("Success.html");
				rd.include(request, response);
			}
			else
			{
				out.println("<h2>Insertion Failed </h2>");
				RequestDispatcher rd = request.getRequestDispatcher("create.html");
				rd.include(request, response);
			}	 
		}
		catch(Exception e)
		{
			out.println("<h4 style='color:red'>ERROR :" +e.getMessage()+"</h4>");
		}
	}

}
