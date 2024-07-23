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
public class ManyToManyDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            EntityTransaction transaction = entityManager.getTransaction();

            try {
                transaction.begin();


                Item i001 = entityManager.find(Item.class, "I001");
                Item i002 = entityManager.find(Item.class, "I002");
                Order o001 = new Order("O001", Date.valueOf(LocalDate.now()),
                        "Tharindu");

                OrderDetail orderDetail1 = new OrderDetail(o001, i001, 2, i001.getPrice());
                OrderDetail orderDetail2 = new OrderDetail(o001, i002, 2, i002.getPrice());

                entityManager.persist(orderDetail1);
                entityManager.persist(orderDetail2);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
