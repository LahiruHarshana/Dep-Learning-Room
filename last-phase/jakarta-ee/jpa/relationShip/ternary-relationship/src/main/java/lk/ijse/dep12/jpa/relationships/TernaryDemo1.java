package lk.ijse.dep12.jpa.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationships.entity.Customer;
import lk.ijse.dep12.jpa.relationships.entity.Product;
import lk.ijse.dep12.jpa.relationships.entity.Supplier;
import lk.ijse.dep12.jpa.relationships.util.JpaUtil;

import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class TernaryDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();


                Customer c001 = new Customer("C001", "Tharindu", "071-83344554");
                Customer c002 = new Customer("C002", "Menith", "071-2342342");
                Customer c003 = new Customer("C003", "Waruna", "071-3423423");

                Supplier hp = new Supplier("S001", "Hp");
                Supplier dell = new Supplier("S002", "DELL");

                Product mouse = new Product("P001", "Mouse");
                Product keyboard = new Product("P002", "KeyBoard");
                Product monitor = new Product("P003", "Monitor");


                List.of(c001,c002,c003,hp,dell,mouse,keyboard,monitor).forEach(em::persist);
                transaction.commit();
                }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
