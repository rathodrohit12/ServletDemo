package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet implements Servlet {

	static {
		System.out.println("MyServlet is loaded....");

	}

	public LoginServlet() {
		System.out.println("Myservlet is instantiated....");

	}

	@Override
	public void destroy() {
		System.out.println("destroy"); 
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

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "root");
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("txtname");
		String email = req.getParameter("txtemail");
		String mobile = req.getParameter("txtmobile");
		String pass = req.getParameter("txtpassword");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(pass);

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		out.println(email);
		out.println(pass);

	}

}
