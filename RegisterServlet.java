package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    Connection con = null;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		con=DBConnection.get();
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String confirm =request.getParameter("cnfm");
		if(pwd.equals(confirm))
		{
			try
			{
				String query = "insert into register values(?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, uname);
				ps.setString(2, pwd);
				int count = ps.executeUpdate();
				if(count>0)
				{
					out.println("Successfully Registered");
					out.println("<h4 style='color:red'>Registration Successfully-Login Now <h4>");
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}
				else
				{
					out.println("failed in registering!");
					out.println("<h4 style='color:red'>ERROR :Registration Failed /Try Again<h4>");
					RequestDispatcher rd = request.getRequestDispatcher("register.html");
					rd.include(request, response);
					
					
				}
			}
			catch(Exception e)
			{
				
				out.println("<h4 style='color:red'>ERROR :" +e.getMessage()+"</h4>");
			}
		}
		else
		{
			out.println("<h4 style='color:red'>ERROR :Password Mismatch <h4>");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
		

		
	}

}
