package lk.ijse.dep12.listener;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import java.util.Set;

/**
 * @author : L.H.J
 * @File: MyRealAppContextListener
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/


public class MyRealAppContextListener implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("Real App Context Listener");
    }
}
