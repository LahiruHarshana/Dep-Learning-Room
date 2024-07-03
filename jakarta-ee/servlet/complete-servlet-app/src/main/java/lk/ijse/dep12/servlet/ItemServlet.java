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

@WebServlet(name = "item-servlet" , urlPatterns = "/items" , loadOnStartup = 0)
public class ItemServlet extends HttpServlet {

    static {
        System.out.println("ItemServlet class object is being initiated");
    }
    public ItemServlet(){
        System.out.println("ItemServlet()");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("ItemServlet : Init()");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ItemServlet ");
        resp.getWriter().println("<h1>Items</h1>");
    }
}
