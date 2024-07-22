package lk.ijse.dep12.jpa.realationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.realationship.entity.Actor;
import lk.ijse.dep12.jpa.realationship.entity.Movie;
import lk.ijse.dep12.jpa.realationship.util.JpaUtil;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class ManyToManyDemo2 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();

            try {
                transaction.begin();


                Movie movie = new Movie("M003", "Asayi Bayayi", "18+", Date.valueOf("2024-07-11"));

                Actor actor = new Actor("A004", "Praveen", Actor.Gender.MALE, Date.valueOf("2000-03-01"));

                em.persist(actor);
                em.persist(movie);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
