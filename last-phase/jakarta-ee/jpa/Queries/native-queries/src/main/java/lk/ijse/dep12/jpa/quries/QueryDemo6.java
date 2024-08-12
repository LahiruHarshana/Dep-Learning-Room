package lk.ijse.dep12.jpa.quries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
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
public class QueryDemo6 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Query query = em.createNativeQuery("""
                        SELECT o.* FROM customer c INNER JOIN `order` o ON c.id = o.customer_id
                        """, Order.class);
                List<Order> orderList = query.getResultList();
                System.out.println(em.find(Customer.class,"C001"));
                System.out.println(em.find(Order.class,"OD001"));
                //methandi ayi wadinne naththe customer t select ekak ?
                // * order eddi customertth eee ekkama enn wenw blnn order class ek ethkota terewi

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
