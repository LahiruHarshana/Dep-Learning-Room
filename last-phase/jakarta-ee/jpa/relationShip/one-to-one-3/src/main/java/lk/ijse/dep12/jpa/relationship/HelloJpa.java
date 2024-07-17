package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/
public class HelloJpa {

    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();


            try {
                tx.begin();
                System.out.println("Entity Manager Factory :"+emf);
                System.out.println("Entity Manager :"+em);

            }catch (Throwable t){
                tx.rollback();
                t.printStackTrace();
            }
        }
    }

}
