package lk.ijse.dep12.jpa.relationships.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author : L.H.J
 * @File: JpaUtil
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class JpaUtil {
    private static final EntityManagerFactory emf =buldEntityManagerFactory();
    private static EntityManagerFactory buldEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("dep-12");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
