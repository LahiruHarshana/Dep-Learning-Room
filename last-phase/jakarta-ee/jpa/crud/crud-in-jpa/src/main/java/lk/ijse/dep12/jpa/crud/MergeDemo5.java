package lk.ijse.dep12.jpa.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.crud.entity.Student;
import lk.ijse.dep12.jpa.crud.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-11, Thursday
 **/
public class MergeDemo5 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            try {
                System.out.println("Searching!");
                Student student = em.find(Student.class, "S001");
                System.out.println("Found");
                System.out.println("Detaching....");
                em.detach(student);
                System.out.println("Detached....");
                System.out.println("Merging....");
                em.getTransaction().commit();
            }catch (Throwable t){
                em.getTransaction().rollback();
                t.printStackTrace();
            }
        }
    }
}
