package lk.ijse.dep;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

/**
 * @author : L.H.J
 * @File: MyFilter2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebFilter(filterName = "my-filter2" ,urlPatterns = "/hello2")
public class MyFilter2 extends HttpFilter {

    static {
        System.out.println("==============================================");
        System.out.println("MyFilter2 class object is beign initialized");
    }
}
