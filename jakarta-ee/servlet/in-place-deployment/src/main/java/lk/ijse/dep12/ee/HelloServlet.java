package lk.ijse.dep12.ee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : L.H.J
 * @File: HelloServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-06-27, Thursday
 **/
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()){
            out.println("""
                
                    <!doctype html>
                
                <html lang='en'>
                <head>
                    <title>Hello Servlet</title>
                </head>
                <body>
                <h1>Hello Servlet - Oyanm maru</h1>
                </body>
      
                             </html>
                
                
                
                """);

        }
    }
}
