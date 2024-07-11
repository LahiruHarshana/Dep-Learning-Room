package lk.ijse.dep12.jpa.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.crud.entity.Student;
import lk.ijse.dep12.jpa.crud.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: ReadDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-11, Thursday
 **/
public class ReadDemo2 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            try {
                Student student1 = em.getReference(Student.class, "S0010");
                Student student2 = em.getReference(Student.class, "S005");
                System.out.println(student2);
                em.getTransaction().commit();
            }catch (Throwable t){
                em.getTransaction().rollback();
                t.printStackTrace();
            }
        }
    }
}
