package lk.ijse.dep12.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @author : L.H.J
 * @File: AppContextListener
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/


//@WebListener
public class RequestListener implements ServletRequestListener {

    static {
        System.out.println("1.RequestListener loaded");
    }

    public RequestListener(){
        System.out.println("2.RequestListener()");
        System.out.println("Thread :" + Thread.currentThread().getName());
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("3. initialized");
    }
}
