package lk.ijse.dep12.jpa.realationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.realationship.entity.Actor;
import lk.ijse.dep12.jpa.realationship.entity.Movie;
import lk.ijse.dep12.jpa.realationship.util.JpaUtil;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class ManyToManyDemo3 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();

            try {
                transaction.begin();

                Movie asayibayai = em.find(Movie.class, "M003");
                Actor tharindu = em.find(Actor.class, "A001");
                Actor praveen = em.find(Actor.class, "A004");
                Actor piumi = em.find(Actor.class, "A003");

                asayibayai.getActors().add(tharindu);
                asayibayai.getActors().add(praveen);
                asayibayai.getActors().add(piumi);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
