package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.relationship.entity.Employee;
import lk.ijse.dep12.jpa.relationship.entity.Spouse;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
public class OneToOneDemo4 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager()) {
            System.out.println("EntityManagerFactory :"+emf);
            System.out.println("EntityManager :" + em);

            em.getTransaction().begin();

            try {
                Employee tharindu = em.find(Employee.class, "E001");
                System.out.println(tharindu.getSpouse());

                Spouse sumalatha = em.find(Spouse.class,"S001");
//                Spouse spouse = tharindu.getSpouse(sumalatha);

                sumalatha.setEmployee(tharindu);
                em.getTransaction().commit();
            }catch (Throwable e){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
