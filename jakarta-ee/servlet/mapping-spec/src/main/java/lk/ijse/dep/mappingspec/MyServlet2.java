package lk.ijse.dep.mappingspec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: MyServlet2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Tuesday
 **/

@WebServlet(name = "my-servlet-2", urlPatterns = "/hello/dep/*")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Wildcard Mapping</h1>");
        resp.getWriter().println("<h1>URL:%s</h1>".formatted(req.getRequestURL()));
        resp.getWriter().println("<h1>URI:%s</h1>".formatted(req.getRequestURI()));
        resp.getWriter().println("<h1>ContextPath:%s</h1>".formatted(req.getContextPath()));
        resp.getWriter().println("<h1>ServletPath:%s</h1>".formatted(req.getServletPath()));
        resp.getWriter().println("<h1>PathInfo:%s</h1>".formatted(req.getPathInfo()));
    }
}
