package lk.ijse.dep12.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * @author : L.H.J
 * @File: AppContextListener
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/


//@WebListener
public class SessionListener implements HttpSessionListener {

    static {
        System.out.println("1.RequestListener loaded");
    }
    public SessionListener(){
        System.out.println("2.RequestListener()");
        System.out.println("Thread :" + Thread.currentThread().getName());
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("2.SessionListener is created");
    }
}
