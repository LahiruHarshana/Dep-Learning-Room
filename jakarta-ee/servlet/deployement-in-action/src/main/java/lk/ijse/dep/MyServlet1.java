package lk.ijse.dep;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: MyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

public class MyServlet1 extends HttpServlet {

    static {
        System.out.println("============================================");
        System.out.println("MyServlet1 class object is being initialized");
        System.out.println("MyServlet2 "+MyServlet2.class.getClassLoader());

    }

}
