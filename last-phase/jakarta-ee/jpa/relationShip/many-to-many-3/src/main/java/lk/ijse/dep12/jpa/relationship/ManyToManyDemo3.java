package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.Item;
import lk.ijse.dep12.jpa.relationship.entity.Order;
import lk.ijse.dep12.jpa.relationship.entity.OrderDetail;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class ManyToManyDemo3 {
    public static void main(String[] args) {
        try (EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            EntityTransaction transaction = entityManager.getTransaction();

            try {
                transaction.begin();




                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
