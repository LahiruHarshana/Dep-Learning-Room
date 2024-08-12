package lk.ijse.dep12.jpa.quries;

import jakarta.persistence.*;
import lk.ijse.dep12.jpa.quries.entity.Customer;
import lk.ijse.dep12.jpa.quries.entity.Order;
import lk.ijse.dep12.jpa.quries.util.JpaUtil;

import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class QueryDemo8 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Query query = em.createNativeQuery("SELECT * FROM `order` WHERE username = ?1 OR username = ?2",
                        Order.class);
                query.setParameter(1,"kasun");
                query.setParameter(2,"nuwan");
                List<Order> orderList = query.getResultList();
                orderList.forEach(System.out::println);


                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
