package lk.ijse.dep;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: MyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebServlet(name = "my-servlet",urlPatterns = "./index.html")
public class MyServlet extends HttpServlet {
    static {
        System.out.println("My Servlet Class");
        System.out.println(Thread.currentThread().getName());
    }
}
