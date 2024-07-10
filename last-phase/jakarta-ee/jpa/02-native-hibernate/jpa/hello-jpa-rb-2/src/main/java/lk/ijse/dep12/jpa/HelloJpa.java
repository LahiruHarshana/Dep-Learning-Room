package lk.ijse.dep12.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class HelloJpa {
    public static void main(String[] args) {
        EntityManager em;
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            em = emf.createEntityManager();
            System.out.println("Entity Manager Factory :" + emf);
        }
        System.out.println("Entity Manager :"+em);
    }

}
