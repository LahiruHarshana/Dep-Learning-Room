package lk.ijse.dep12.routing;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: Servlet1
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebServlet(name = "servlet1", urlPatterns = "/hello1",loadOnStartup = 0)
public class Servlet1 extends HttpServlet {
}
