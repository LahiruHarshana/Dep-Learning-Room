package lk.ijse.dep;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.net.http.HttpRequest;

/**
 * @author : L.H.J
 * @File: MyServlet2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebServlet(name = "my-servlet-2",urlPatterns = "/hello-2",loadOnStartup = 10)
public class MyServlet2 extends HttpServlet {

    static {
        System.out.println("============================================");
        System.out.println("MyServlet2 class object is being initialized");
        System.out.println("MyServlet2 "+MyServlet2.class.getClassLoader());
        new Customer();
    }
}
