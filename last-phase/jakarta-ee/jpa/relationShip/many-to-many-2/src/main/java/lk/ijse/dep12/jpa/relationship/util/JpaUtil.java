package lk.ijse.dep12.jpa.relationship.util;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author : L.H.J
 * @File: JpaUtil
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class JpaUtil {
    private static final EntityManagerFactory emf = buildEntityMangerFactory();

    private static EntityManagerFactory buildEntityMangerFactory(){
        return Persistence.createEntityManagerFactory("dep-12");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
