package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

 	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
		String pass = request.getParameter("password");
        
		
		HttpSession session = request.getSession();
		if(session.isNew()) {
			
		}
		
		
        session.setAttribute("email", email);
        session.setAttribute("pass", pass);
        
       // out.println("<h1><a href='Homepage'>Click to go to Homepage</a></h1>");
        String encodeUrl = response.encodeUrl("Homepage");
        out.println(encodeUrl);
       // out.println("<a href='"+encodeUrl+"'>click</a>");
        //out.println("<br><a href="+encodeUrl+">Next</a>");
        
    }
	

}
