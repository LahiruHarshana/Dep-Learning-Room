package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.User;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.sql.Date;
import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/
public class OneToOneDemo1 {

    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();


            try {
                tx.begin();

                User tharindu = new User("1231232", "Tharindu", "Galle", Date.valueOf("2000-07-11"), User.Gender.MALE);
                User imantha = new User("1231132", "imantha", "Galle", Date.valueOf("2000-07-11"), User.Gender.MALE);
                User budhdhika = new User("11113232", "budhdhika", "Galle", Date.valueOf("2002-11-01"), User.Gender.MALE);
                User piumi = new User("1245232", "piumi", "Galle", Date.valueOf("2004-11-11"), User.Gender.FEMALE);
                User saduni = new User("1239032", "saduni", "Galle", Date.valueOf("2001-07-11"), User.Gender.FEMALE);

                List.of(tharindu,piumi,budhdhika,imantha,saduni).forEach(em::persist);
                tx.commit();
            }catch (Throwable t){
                tx.rollback();
                t.printStackTrace();
            }
        }
    }

}
