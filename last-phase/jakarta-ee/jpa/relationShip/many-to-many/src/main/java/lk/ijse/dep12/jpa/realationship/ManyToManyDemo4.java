package lk.ijse.dep12.jpa.realationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.realationship.entity.Actor;
import lk.ijse.dep12.jpa.realationship.entity.Movie;
import lk.ijse.dep12.jpa.realationship.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class ManyToManyDemo4 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();

            try {
                transaction.begin();


                Actor tharindu = em.find(Actor.class, "A001");
                tharindu.

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
