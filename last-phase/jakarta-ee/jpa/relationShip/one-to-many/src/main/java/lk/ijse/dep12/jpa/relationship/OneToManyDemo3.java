package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.Order;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;
import org.hibernate.Session;
import org.hibernate.collection.spi.PersistentBag;
import org.hibernate.internal.SessionImpl;

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
public class OneToManyDemo3 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();


                Customer yasiya = em.find(Customer.class, "0332323");
                Customer kajja = em.find(Customer.class, "01112223");
                kajja.getOrders().forEach(out::println);
                out.println("---------------");
                SessionImpl session = em.unwrap(SessionImpl.class);
                out.println(session.isDirty());
                printPersistentBagStatus(kajja.getOrders());
//                kajja.getOrders().remove(1);
                kajja.getOrders().add(new Order("OD006", Date.valueOf(LocalDate.now()),new BigDecimal("1800"),yasiya));
                out.println(session.isDirty());
                printPersistentBagStatus(kajja.getOrders());
                out.println("-----------------");
                kajja.getOrders().forEach(out::println);
                kajja.setAddress("Weligama");
                out.println("-----------------");
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
