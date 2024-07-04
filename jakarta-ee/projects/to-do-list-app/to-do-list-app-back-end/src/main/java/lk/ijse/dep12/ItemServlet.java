package lk.ijse.dep12;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: MyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-04, Thursday
 **/


@WebServlet(name = "item-servlet",urlPatterns = "users/me/items/*")
public class ItemServlet extends HttpServlet {
    
}
