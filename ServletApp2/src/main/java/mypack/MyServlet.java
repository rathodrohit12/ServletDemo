package mypack;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

public class MyServlet extends HttpServlet {
 
	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		 
//		PrintWriter out = res.getWriter();
//		out.println("original service");
//	}
//	  
	
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		 
//		 
//		PrintWriter out = res.getWriter();
//		out.println("http service");
//	}
//	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 
		 // by default doget run 
		PrintWriter out = res.getWriter();
		out.println("do Get service");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 
		 
		PrintWriter out = res.getWriter();
		out.println("do Post service");
	}
	
	
	
	
}

