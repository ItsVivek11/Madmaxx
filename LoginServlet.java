package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","2101020733");
			String query = "select * from register where username=? and password=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
//				out.println("<h4 style='color:red'>Login Success <h4>");
//				out.println("<h2 style='color:blue'>account operations <h2>");
//				out.println("<ul>");
//				out.println("<li> <a href='create.html'> create account </a></li>");
//				out.println("<li> <a href='display.html'> display </a></li>");
//				out.println("<li> <a href='deposit.html'> deposit </a></li>");
//				out.println("<li> <a href='withdraw.html'> withdraw </a></li>");
//				out.println("<li> <a href='#'> logout </a></li>");
//				out.println("</ul>");
				RequestDispatcher rd = request.getRequestDispatcher("Success.html");
				rd.forward(request, response);



				
			}
			else
			{
				
				out.println("<h4 style='color:red'>Login Failed - Try Again </h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
				
				
			}
		}
		catch(Exception e)
		{
			out.println("<h4 style='color:red'>ERROR :" +e.getMessage()+"</h4>");
			out.println("<h4 style='color:red'>Not Registered /kindly registered </h4>");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
		
		
	}

}
