package lk.ijse.dep.mappingspec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: RouteServlet1
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Tuesday
 **/

@WebServlet(name = "route-servlet-2" , urlPatterns = "/route/*")
public class RouteServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Route Servlet2: WildCard Mapping</h1>");
    }
}
