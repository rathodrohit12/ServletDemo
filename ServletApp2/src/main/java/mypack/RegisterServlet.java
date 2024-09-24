package mypack;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterServlet implements Servlet {
	Connection con = null;

	static {
		System.out.println("RegisterServlet is loaded....");

	}

	public RegisterServlet() {
		System.out.println("RegisterServlet is instantiated....");

	}

	@Override
	public void destroy() {
		System.out.println("destroy"); // it destroy after suffient amount of time automatically

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "root");
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
		res.getWriter().println("<h1>" + "Name: " + name + "</h1>");
		res.getWriter().println("<p>Email: " + email + "</p>");
		res.getWriter().println("<p>Mobile: " + mobile + "</p>");
		res.getWriter().println("<p>Password: " + pass + "</p>");

		try {
			PreparedStatement ps = con.prepareStatement("insert into user(name, email, mobile, pass) values(?,?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, mobile);
			ps.setString(4, pass);

			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Record inserted......");
			} else {
				System.out.println("Record not inserted....");

			}

		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}

	}

}
