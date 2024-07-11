package lk.ijse.dep12.jpa.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.crud.entity.Student;
import lk.ijse.dep12.jpa.crud.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: FindVsGetReference
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-11, Thursday
 **/
public class FindVsGetReference {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            try {

                Student student1 = em.getReference(Student.class, "S001");
                Student student2 = em.getReference(Student.class, "S002");
                Student student3 = em.getReference(Student.class,"S003");

                System.out.println("----------");

                System.out.println(student1);
                System.out.println(student2);
                System.out.println("----------------");
                System.out.println(student3.getId());
                em.getTransaction().commit();
            }catch (Throwable t){
                em.getTransaction().rollback();
                t.printStackTrace();
            }
        }
    }
}
