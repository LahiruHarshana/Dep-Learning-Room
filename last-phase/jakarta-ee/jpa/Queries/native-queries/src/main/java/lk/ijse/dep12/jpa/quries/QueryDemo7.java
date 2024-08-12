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
public class QueryDemo7 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Query query = em.createNativeQuery("""
                        SELECT c.*, o.id order_id,o.date order_date FROM customer c INNER JOIN `order` o ON c.id = o.customer_id
                        """, Tuple.class);
                List<Tuple> rowList = query.getResultList();
                rowList.forEach(row -> {
                    System.out.printf("id=%s, name=%s,order-id=%s,order-date=%s%n",
                            row.get("id"),row.get("name"),row.get("order_id"),row.get("order_date"));
                });
                System.out.println("--------------------------------------------");
                System.out.println(em.find(Customer.class,"C001"));
                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
