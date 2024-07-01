package lk.ijse.dep.inplacedeployment4;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/index.html")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()) {
            out.println("""

                    <!doctype html>
                    <html lang="en">
                    <head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
                    </head>
                    <body>
                    <h1> Hai meka anthima eka</h1>
                    <h1> Hai meka anthima eka</h1>
                    <h1> Hai meka anthima eka</h1>
                    <h1> Hai meka anthima eka</h1>
                    </body>
                    </html>""");
        }
    }
}