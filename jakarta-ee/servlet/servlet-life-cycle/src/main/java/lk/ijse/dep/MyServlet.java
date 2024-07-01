package lk.ijse.dep;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: MyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebServlet(name = "my-servlet",urlPatterns = "/hello",loadOnStartup = 0)
public class MyServlet extends HttpServlet {
    static {
        System.out.println("========================================================");
        System.out.println("My Servlet Class");
        System.out.println(Thread.currentThread().getName());
        System.out.println("========================================================");

    }

    public MyServlet() {
        System.out.println("========================================================");
        System.out.println("My Servlet Constructor");
        System.out.println(Thread.currentThread().getName());
        System.out.println("========================================================");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("========================================================");
        System.out.println("My Servlet Init");
        System.out.println("ServletContext :" + getServletContext());
        System.out.println(Thread.currentThread().getName());
        super.init();
        System.out.println("My Boy just graduate to the servlet");
        System.out.println("ServletContext :" + getServletContext());
        System.out.println("========================================================");
    }
}
