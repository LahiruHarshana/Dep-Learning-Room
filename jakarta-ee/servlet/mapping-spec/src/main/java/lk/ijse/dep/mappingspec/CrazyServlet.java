package lk.ijse.dep.mappingspec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: CrazyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Tuesday
 **/

@WebServlet(name = "crazy-servlet", urlPatterns = {"/crazy","/pissu"})
public class CrazyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Crazy Servlet</h1>");
    }
}
