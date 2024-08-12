package lk.ijse.dep12.jpa.quries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import lk.ijse.dep12.jpa.quries.entity.Customer;
import lk.ijse.dep12.jpa.quries.util.JpaUtil;

import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class QueryDemo4 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Query que = em.createNativeQuery("SELECT * FROM customer", Customer.class);
                que.setFirstResult(2);
                que.setMaxResults(2);
                List<Customer> customers = que.getResultList();
                customers.forEach(System.out::println);
                customers.forEach(c -> System.out.println(c.getId() + "is inside the context? " + em.contains(c)));
                customers.get(0).setName("Nuwan");

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
