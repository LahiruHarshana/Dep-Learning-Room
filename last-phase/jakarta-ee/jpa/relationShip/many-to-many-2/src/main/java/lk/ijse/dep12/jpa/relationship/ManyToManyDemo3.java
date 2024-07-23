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
import java.util.List;

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

                Item i001 = entityManager.find(Item.class, "I001");
                Item i002 = entityManager.find(Item.class, "I002");
                Item i003 = entityManager.find(Item.class, "I003");
                OrderDetail orderDetail1 = new OrderDetail(null, i001, 2, i001.getPrice());
                OrderDetail orderDetail2 = new OrderDetail(null, i002, 1, i002.getPrice());
                OrderDetail orderDetail3 = new OrderDetail(null, i003, 1, i003.getPrice());
                List<OrderDetail> orderDetailList = List.of(orderDetail1,orderDetail2,orderDetail3);


                Order o002 = new Order("O002", Date.valueOf(LocalDate.now()), "Asiri",orderDetailList);

                entityManager.persist(o002);


                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
