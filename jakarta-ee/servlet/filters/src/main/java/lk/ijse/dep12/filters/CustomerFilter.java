package lk.ijse.dep12.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author : L.H.J
 * @File: CustomerFilter
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/

public class CustomerFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Customer Filter : Incoming Request");
        chain.doFilter(req,res);
        System.out.println("Customer Filter : Outgoing Request");
    }
}
