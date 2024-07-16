package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.relationship.entity.Account;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.User;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
public class OneToOneDemo9 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager()) {
            System.out.println("EntityManagerFactory :"+emf);
            System.out.println("EntityManager :" + em);

            em.getTransaction().begin();

            try {

                User lahiru = new User("1231232", "Lahiru", "Galle", Date.valueOf("2000-08-11"), User.Gender.MALE);
                User chamru = new User("232323", "Chamaru", "Galle", Date.valueOf("1990-02-11"), User.Gender.MALE);
                User thisaru = new User("4442221", "Thisaru", "Galle", Date.valueOf("1990-11-11"), User.Gender.MALE);
                User sachini = new User("111222", "Sachini", "Galle", Date.valueOf("2003-11-11"), User.Gender.FEMALE);

                List.of(lahiru,chamru,thisaru,sachini).forEach(em::persist);

                em.getTransaction().commit();
            }catch (Throwable e){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
