package lk.ijse.dep.webapproottest2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: DepServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/


@WebServlet(name = "dep-servlet",urlPatterns = "/ijse/dep.html")
public class DepServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>DEPServlet</h1>");
    }
}
