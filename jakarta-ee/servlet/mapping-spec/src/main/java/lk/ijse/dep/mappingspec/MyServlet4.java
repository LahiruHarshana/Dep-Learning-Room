package lk.ijse.dep.mappingspec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: MyServlet4
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Tuesday
 **/

@WebServlet(name = "my-servlet-4" , urlPatterns = "")
public class MyServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Context Mapping</h1>");
    }
}
