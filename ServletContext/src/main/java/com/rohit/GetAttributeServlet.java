package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetAttributeServlet")
public class GetAttributeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		String attribute = (String) context.getAttribute("shared");

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.printf("<h1> shared data:%s </h1>", attribute);
		
	}

}
