package lk.ijse.dep;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @author : L.H.J
 * @File: Listener2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebListener
public class Listener2 implements ServletContextListener {

    static {
        System.out.println("=======================================");
        System.out.println("Listener2 class object is beign initilaized");
    }
}
