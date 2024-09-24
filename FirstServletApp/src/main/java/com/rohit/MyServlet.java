package com.rohit;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {

	static {
		System.out.println("MyServlet is loaded....");

	}

	public MyServlet() {
		System.out.println("Myservlet is instantiated....");

	}

	@Override
	public void destroy() {
		System.out.println("destroy"); // it destroy after sufficient amount of time automatically

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	/*
	 * init method require ServletConfig object
	 */

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
	}
	/*
	 * ServletRequest, ServletResponse are both interface
	 */

}
