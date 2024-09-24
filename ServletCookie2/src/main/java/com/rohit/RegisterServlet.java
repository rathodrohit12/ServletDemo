package com.rohit;

/*
 * Step1. Creating cookies
 * Step2. Add cookies to the response
 * 
 */





import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String pass = req.getParameter("password");
		
		res.setContentType("text/html");
		
		Cookie nameCookie = new Cookie("name", name);
		Cookie emailCookie = new Cookie("email", email);
		Cookie mobileCookie = new Cookie("mobile", mobile);
		Cookie passCookie = new Cookie("password", pass);

		res.addCookie(nameCookie);
		res.addCookie(emailCookie);
		res.addCookie(mobileCookie);
		res.addCookie(passCookie);

		

		PrintWriter out = res.getWriter();
		out.println("<html><body>");
        out.println("<p>Cookies have been set.</p>");
        out.println("<a href='LoginServlet'>Click here to go to LoginServlet</a>");
        out.println("</body></html>");

	}

}
