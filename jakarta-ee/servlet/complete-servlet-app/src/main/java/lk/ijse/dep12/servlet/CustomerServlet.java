package lk.ijse.dep12.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: CustomerServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/

@WebServlet(name = "customer-servlet" , urlPatterns = "/customers" , loadOnStartup = 0)
public class CustomerServlet extends HttpServlet {

    static {
        System.out.println("Customer Servlet class object is being initiated");
    }
    public CustomerServlet(){
        System.out.println("CustomerServlet()");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("CustomerServlet : Init()");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Customer Servlet");
        resp.getWriter().println("<h1>Customers</h1>");
    }
}
