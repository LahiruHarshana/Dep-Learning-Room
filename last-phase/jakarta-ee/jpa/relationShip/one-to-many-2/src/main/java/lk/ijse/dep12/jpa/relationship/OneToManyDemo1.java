package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.LawSuite;
import lk.ijse.dep12.jpa.relationship.entity.Lawyer;
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
public class OneToManyDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();


            try {
                transaction.begin();

                Lawyer tharindu = new Lawyer("L001", "Tharindu");
                Lawyer buddhika = new Lawyer("L002", "Buddhika");

                LawSuite ls001 = new LawSuite("Ls-001", "Criminal", "Sappage Sapa Kema", Date.valueOf(LocalDate.now()),tharindu);
                LawSuite ls002 = new LawSuite("Ls-002", "Criminal", "MinuwanGoda Sapa Kema", Date.valueOf(LocalDate.now()));
                LawSuite ls003 = new LawSuite("Ls-003", "Criminal", "Menith Sapa Kema", Date.valueOf(LocalDate.now()));

                List.of(tharindu,buddhika,ls001,ls002,ls003).forEach(em::persist);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }

    }
}
