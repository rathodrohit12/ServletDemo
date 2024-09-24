import java.io.*;
import javax.servlet.*;

public class MyServlet implements Servlet {

    public void init(ServletConfig config) {
        System.out.println("hi");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter p =res.getWriter();
        p.println("Hello Servlet");
    }

    public void destroy() {
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {

        return null;
    }

}