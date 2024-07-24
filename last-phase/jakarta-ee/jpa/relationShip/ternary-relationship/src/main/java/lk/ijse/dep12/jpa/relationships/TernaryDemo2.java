package lk.ijse.dep12.jpa.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationships.entity.Customer;
import lk.ijse.dep12.jpa.relationships.entity.Product;
import lk.ijse.dep12.jpa.relationships.entity.Purchase;
import lk.ijse.dep12.jpa.relationships.entity.Supplier;
import lk.ijse.dep12.jpa.relationships.util.JpaUtil;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class TernaryDemo2 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();


                Customer c001 = em.find(Customer.class,"C001");
                Customer c002 = em.find(Customer.class,"C002");
                Customer c003 = em.find(Customer.class,"C003");

                Supplier hp = em.find(Supplier.class,"S001");
                Supplier dell = em.find(Supplier.class,"S002");

                Product mouse = em.find(Product.class,"P001");
                Product keyboard =em.find(Product.class,"P002");
                Product monitor = em.find(Product.class,"P003");

                Purchase pu1 = new Purchase(c001, mouse, hp, 5, new BigDecimal("1250"));
                Purchase pu2 = new Purchase(c001, keyboard, hp, 5, new BigDecimal("1200"));
                Purchase pu3 = new Purchase(c002, keyboard, dell, 10, new BigDecimal("1500"));
                Purchase pu4 = new Purchase(c003, keyboard, dell, 10, new BigDecimal("1300"));
                Purchase pu5 = new Purchase(c003,  monitor, hp, 5, new BigDecimal("1100"));


                List.of(pu1,pu2,pu3,pu4,pu5).forEach(em::persist);

                transaction.commit();
                }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
