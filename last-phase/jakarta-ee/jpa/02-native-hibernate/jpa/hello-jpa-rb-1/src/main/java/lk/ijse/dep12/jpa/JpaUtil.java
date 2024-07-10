package lk.ijse.dep12.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.IOException;
import java.util.Properties;

/**
 * @author : L.H.J
 * @File: JpaUtil
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class JpaUtil {
    private static final EntityManagerFactory emf = buildEntityMangerFactory();

    private static EntityManagerFactory buildEntityMangerFactory(){
        Properties properties = new Properties();
        try {
            properties.load(JpaUtil.class.getResourceAsStream("/application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Persistence.createEntityManagerFactory("dep-12",properties);
    }


    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
