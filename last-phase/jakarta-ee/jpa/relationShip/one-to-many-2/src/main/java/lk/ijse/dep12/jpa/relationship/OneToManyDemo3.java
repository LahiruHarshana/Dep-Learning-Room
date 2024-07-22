package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.LawSuite;
import lk.ijse.dep12.jpa.relationship.entity.Lawyer;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class OneToManyDemo3 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();


            try {
                transaction.begin();

                Lawyer buddhika = em.find(Lawyer.class, "L002");
                LawSuite ls002 = em.find(LawSuite.class, "Ls-002");
//                System.out.println(ls002.getLawyer()); // Lawyer = Tharindu
//                ls002.setLawyer(buddhika); //Update
                LawSuite ls001 = em.find(LawSuite.class, "Ls-001");

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }

    }
}
