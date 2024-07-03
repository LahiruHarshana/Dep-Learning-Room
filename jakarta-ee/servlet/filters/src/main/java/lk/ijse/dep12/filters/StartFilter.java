package lk.ijse.dep12.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: StartFilter
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/

//@WebFilter(filterName = "start-filer" ,urlPatterns = "/*")
public class StartFilter extends HttpFilter {

    static {
        System.out.println("StartFilter class object is being initialized");
        System.out.println("Thread: "+Thread.currentThread().getName());
    }


    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init(FilterConfig)");
        System.out.println("Thread: "+Thread.currentThread().getName());

        try {
            getServletContext();
        }catch (Exception e){
            System.out.println("Yet to graduate to HttpFilter");
        }
        super.init(config);
    }


    @Override
    public void init() throws ServletException {
        System.out.println("init()");
        System.out.println("Servlet Context: "+getServletContext());
        System.out.println();
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Start Filter : Incoming Request");
        chain.doFilter(req,res);
        System.out.println("Start Filter : Outgoing Filter");
    }
}
