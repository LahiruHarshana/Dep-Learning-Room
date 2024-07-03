package lk.ijse.dep12.filters;

import jakarta.servlet.FilterChain;
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
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Start Filter : Incoming Request");
        chain.doFilter(req,res);
        System.out.println("Start Filter : Outgoing Filter");
    }
}
