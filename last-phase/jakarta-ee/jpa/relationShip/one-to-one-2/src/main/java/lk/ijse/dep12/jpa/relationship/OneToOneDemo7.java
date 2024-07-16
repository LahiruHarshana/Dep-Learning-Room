package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.relationship.entity.Account;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.Employee;
import lk.ijse.dep12.jpa.relationship.entity.Spouse;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
public class OneToOneDemo6 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager()) {
            System.out.println("EntityManagerFactory :"+emf);
            System.out.println("EntityManager :" + em);

            em.getTransaction().begin();

            try {
                Customer customer = new Customer("123442235V", "kasun", "Sampath", "Panadura", "011-221212", Date.valueOf("1980-10-08"));
                Account account = new Account("12-12121-12", "Savings", new BigDecimal("10000.00"), customer, Date.valueOf(LocalDate.now()), "Tharindu");
                em.persist(customer);
                em.persist(account);

                em.getTransaction().commit();
            }catch (Throwable e){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
