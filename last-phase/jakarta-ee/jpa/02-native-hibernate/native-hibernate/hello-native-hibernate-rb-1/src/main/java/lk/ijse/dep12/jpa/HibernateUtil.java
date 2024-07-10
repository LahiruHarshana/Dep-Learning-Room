package lk.ijse.dep12.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author : L.H.J
 * @File: HibernateUtil
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class HibernateUtil {
    private static final SessionFactory sessionFactory =buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
