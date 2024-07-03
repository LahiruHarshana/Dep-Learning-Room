package filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
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
public class StartFilter extends HttpFilter {

    {
        System.out.println("startFilter class object is being loaded");
    }

    public StartFilter(){
        System.out.println("StartFilter() singleton is being contructed");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("StartFilter : init()");
    }


    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("StartFilter: Incoming Request");
        chain.doFilter(req,res);
        System.out.println("StartFilter: Outgoing Request");
    }
}
