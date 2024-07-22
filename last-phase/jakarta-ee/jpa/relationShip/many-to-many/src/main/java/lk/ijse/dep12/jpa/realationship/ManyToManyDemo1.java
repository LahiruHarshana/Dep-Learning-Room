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
public class ManyToManyDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();

            try {
                transaction.begin();


                Actor a001 = new Actor("A001", "Tharindu", Actor.Gender.MALE, Date.valueOf(LocalDate.now()));
                Actor a002 = new Actor("A002", "Imantha", Actor.Gender.MALE, Date.valueOf(LocalDate.now()));
                Actor a003 = new Actor("A003", "Piumi", Actor.Gender.FEMALE, Date.valueOf(LocalDate.now()));

                Movie m001 = new Movie("M001", "Iron Man 2", "Action", Date.valueOf(LocalDate.now()), List.of(a001, a002, a003));
                Movie m002 = new Movie("M002", "Oyai Mamai", "Romance", Date.valueOf(LocalDate.now()), List.of(a002, a003));


                em.persist(m001);
                em.persist(m002);


                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
