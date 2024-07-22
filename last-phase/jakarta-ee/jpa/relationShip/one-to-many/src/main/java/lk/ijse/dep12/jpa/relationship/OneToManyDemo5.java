package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.Order;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;
import org.hibernate.collection.spi.PersistentBag;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static java.lang.System.out;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/
public class OneToManyDemo5 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();

                Order o001 = new Order("O001", Date.valueOf(LocalDate.now()),
                        new BigDecimal("1250.00"), null);
                Order o002 = new Order("O002", Date.valueOf(LocalDate.now()),
                        new BigDecimal("100.00"), null);
                Order o003 = new Order("O003", Date.valueOf(LocalDate.now()),
                        new BigDecimal("1000.00"), null);
                Customer tharindu = new Customer("071-8334554", "Tharindu", "Galle",List.of(o001,o002,o003));

                em.persist(tharindu);

                tx.commit();
            }catch (Throwable t){
                tx.rollback();
                t.printStackTrace();
            }
        }
    }

    private static void printPersistentBagStatus(List<Order> persistentBag){
        out.println("PersistentBag Dirty :"+((PersistentBag<Order>) persistentBag).isDirty());
    }
}
