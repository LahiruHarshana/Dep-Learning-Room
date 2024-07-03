package lk.ijse.dep.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @author : L.H.J
 * @File: RequestResponseListener
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-03, Wednesday
 **/

@WebListener
public class RequestResponseListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request ekak awa"+sre.getServletRequest().getRemoteAddr());
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request eka process karala iwrayi");
    }
}
