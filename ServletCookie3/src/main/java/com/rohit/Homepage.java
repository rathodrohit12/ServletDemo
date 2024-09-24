package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Homepage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		String email = (String)session.getAttribute("email");
		String pass = (String)session.getAttribute("pass");
				
		out.println(email);
		out.println(pass);
		out.println("<a href='LogoutServlet'>Logout</a>");
		
		session.setMaxInactiveInterval(15);
	}

	

}
