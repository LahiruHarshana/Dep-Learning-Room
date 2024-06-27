package lk.ijse.dep12.ee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;

/**
 * @author : L.H.J
 * @File: Myservlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-06-27, Thursday
 **/
public class MyServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/dep12-java-ee-servlet?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345678";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Get Request");
        resp.setContentType("text/html");

        try (PrintWriter out = resp.getWriter()) {
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

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

                out.println("<table border='1'>");
                out.println("<tr><th>ID</th><th>Name</th></tr>");
                while (resultSet.next()) {
                    out.println("<tr>");
                    out.println("<td>" + resultSet.getInt("customer_id") + "</td>");
                    out.println("<td>" + resultSet.getString("name") + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<p>Error connecting to the database: " + e.getMessage() + "</p>");
            }
        }
    }
}
