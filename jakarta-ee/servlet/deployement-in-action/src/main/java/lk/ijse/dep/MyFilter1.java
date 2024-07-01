package lk.ijse.dep;

import jakarta.servlet.http.HttpFilter;

/**
 * @author : L.H.J
 * @File: MyFilter1
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/
public class MyFilter1 extends HttpFilter {

    static {
        System.out.println("==============================================");
        System.out.println("MyFilter1 class object is beign initialized");
    }
}
