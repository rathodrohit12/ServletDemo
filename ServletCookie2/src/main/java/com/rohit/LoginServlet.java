package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                
//            	out.println("<p>" + cookie.getName() + ": " + cookie.getValue() + "</p>");
//            	
//            }
        	for(int i=0; i<cookies.length; i++) {
        		cookie = cookies[i];
        		out.println("<p>" + cookie.getName() + ": " + cookie.getValue() + "</p>");
        	}
        	//cookie.setMaxAge(0);
        	
           
        } else {
            out.println("<p>No cookies found.</p>");
        }
    }
	

}
