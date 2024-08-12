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
public class QueryDemo5 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Query query = em.createNativeQuery("SELECT * FROM customer");
                List<Object[]> resultList = query.getResultList();
                resultList.forEach(c -> {
                    System.out.printf("id=%s, name=%s %n",c[0],c[1]);
                    System.out.println(c[0] + "is inside the context" + em.contains(c));
                });
                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
