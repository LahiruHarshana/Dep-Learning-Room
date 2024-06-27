package lk.ijse.dep12.ee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author : L.H.J
 * @File: Myservlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-06-27, Thursday
 **/
public class Myservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get Request");
        resp.setContentType("text/html");

        try(PrintWriter out = resp.getWriter()){
            out.println("""
                    <!DOCTYPE html>
                <html>
                    <head>
                        <title>My First Servlet</title>
                    </head>
                    <body>
                        <h1>Hello Servlet</h1>
                        <h1>Server Date and Time: %s</h1>
                    </body>
                </html>""".formatted(LocalDateTime.now()));
        }
    }
}
