package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.relationship.entity.Employee;
import lk.ijse.dep12.jpa.relationship.entity.Spouse;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

import java.util.List;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
public class OneToOneDemo2 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager()) {
            System.out.println("EntityManagerFactory :"+emf);
            System.out.println("EntityManager :" + em);

            em.getTransaction().begin();

            try {

                Spouse sumana = em.find(Spouse.class,"S001");
                System.out.println(sumana);
                System.out.println(sumana.getEmployee());


                em.getTransaction().commit();
            }catch (Throwable e){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
