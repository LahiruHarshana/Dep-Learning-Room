package lk.ijse.dep12.jpa.quries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.quries.entity.*;
import lk.ijse.dep12.jpa.quries.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class QueryDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                Customer c001 = em.find(Customer.class, "C001");
                User asiri = em.find(User.class, "asiri");
                Item i001 = em.find(Item.class , "I001");
                Order od0011 = em.find(Order.class, "OD001");
                OrderDetail od001 = em.find(OrderDetail.class, new OrderDetailPK(od0011,i001));

                System.out.println(c001);
                System.out.println(asiri);
                System.out.println(i001);
                System.out.println(od0011);
                System.out.println(od001);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
