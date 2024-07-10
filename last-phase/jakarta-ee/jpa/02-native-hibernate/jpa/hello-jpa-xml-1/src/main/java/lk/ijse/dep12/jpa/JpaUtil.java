package lk.ijse.dep12.jpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author : L.H.J
 * @File: JpaUtil
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class JpaUtil {
    private final static EntityManagerFactory emf = buildEntityManagerFactory();
    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("dep-12");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
