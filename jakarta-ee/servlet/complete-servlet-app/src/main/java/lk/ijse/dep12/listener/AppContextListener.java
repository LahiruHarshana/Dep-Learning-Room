package lk.ijse.dep12.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebListener;

/**
 * @author : L.H.J
 * @File: AppContextListener
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/


@WebListener
public class AppContextListener implements ServletContextListener {

    static {
        System.out.println("1.ServletContextListener loaded");
    }
    public AppContextListener(){
        System.out.println("2.ServletContextListener()");
        System.out.println("Thread :" + Thread.currentThread().getName());
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("3.Servlet context has been just initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet context has been just destroyed");
    }
}
