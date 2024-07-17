package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.Order;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/
public class OneToManyDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();

                Customer kajja = new Customer("01112223", "kajja", "Galle");
                Customer muditha = new Customer("033-2223", "Muditha", "Matara");
                Customer yasiya = new Customer("0332323", "Yasiya", "Kandy");


                Order o0232 = new Order("O0232", Date.valueOf(LocalDate.now()), new BigDecimal("1200.00"),kajja);
                Order o0233 = new Order("O0233", Date.valueOf(LocalDate.now()), new BigDecimal("5000.00"),kajja);
                Order o0234 = new Order("O0234", Date.valueOf(LocalDate.now()), new BigDecimal("2500.00"),kajja);
                Order o0235 = new Order("O0235", Date.valueOf(LocalDate.now()), new BigDecimal("2500.00"),muditha);

                List.of(kajja,muditha,yasiya,o0232,o0233,o0234,o0235).forEach(em::persist);


                tx.commit();
            }catch (Throwable t){
                tx.rollback();
                t.printStackTrace();
            }
        }
    }
}
