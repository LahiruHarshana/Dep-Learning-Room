package lk.ijse.dep12;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: UserServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-04, Thursday
 **/


@WebServlet(name = "user-servlet" ,urlPatterns = "/users/*")
@MultipartConfig(location = "/tmp",maxFileSize = 5 * 1024 * 1024 * 1024)
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>GET USER</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>POST USER</h1>");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        Part picture = req.getPart("picture");
        picture.write("/Users/lahiruharshana/Downloads/DEP_IMG");
        resp.getWriter().println("Name : " + name + "<br>");
        resp.getWriter().println("Password : " + password + "<br>");
        resp.getWriter().println("Email : " + email + "<br>");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>DELETE USER</h1>");
    }

    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>DELETE USER</h1>");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equals("PATCH")) {
            doPatch(req, resp);
        } else {
            super.service(req, resp);
        }
    }
}
