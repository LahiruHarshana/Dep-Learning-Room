package lk.ijse.dep;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * @author : L.H.J
 * @File: MyServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-01, Monday
 **/

@WebServlet(name = "my-servlet",urlPatterns = "/hello",loadOnStartup = 0)
public class MyServlet extends HttpServlet {

    static {
        System.out.println("1. MyServlet class object is being loaded");
    }

    public MyServlet(){
        System.out.println("2. MyServlet constroctor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("3. GenericServlet init()");
        try {
            getServletContext();
        }catch (Throwable t){
            System.out.println("4. Yet to graduate");
        }
        super.init(config);
        System.out.println("6. Exited:GenericServlet init()");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("5. init()");
        System.out.println("5. Servlet Context: "+getServletContext());
    }
}
