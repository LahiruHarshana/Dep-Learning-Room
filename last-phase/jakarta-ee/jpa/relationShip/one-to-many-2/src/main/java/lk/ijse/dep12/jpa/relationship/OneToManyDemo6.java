package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.LawSuite;
import lk.ijse.dep12.jpa.relationship.entity.Lawyer;
import lk.ijse.dep12.jpa.relationship.entity.LawyerLawSuite;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class OneToManyDemo6 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();


            try {
                transaction.begin();

                Lawyer buddhika = em.find(Lawyer.class, "L002");
                LawSuite ls001 = em.find(LawSuite.class, "Ls-001");
                LawSuite ls002 = em.find(LawSuite.class, "Ls-002");
                LawyerLawSuite lawyerLawSuite1 = new LawyerLawSuite(ls001, buddhika, new BigDecimal("65000.00"), Date.valueOf(LocalDate.now()));
                LawyerLawSuite lawyerLawSuite2 = new LawyerLawSuite(ls002, buddhika, new BigDecimal("75555.00"), Date.valueOf(LocalDate.now()));

//                em.persist(lawyerLawSuite1);
                em.persist(lawyerLawSuite2);

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }

    }
}
