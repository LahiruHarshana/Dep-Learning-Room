import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author : L.H.J
 * @File: HelloNativeHibernate
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class HelloNativeHibernate {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("Session Factory :"+sessionFactory);
        System.out.println("Session :"+session);

    }
}
