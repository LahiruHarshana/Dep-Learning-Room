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
public class CacheDemo {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            try {
                Student s001 = em.find(Student.class, "S001");
                System.out.println("------------------");
                Student s002 = em.find(Student.class, "S001");
                Student s003 = em.find(Student.class, "S001");
                Student s004 = em.find(Student.class, "S001");

                System.out.println(s001 == s002);
                System.out.println(s002 == s003);
                System.out.println(s004 == s004);
                em.getTransaction().commit();
            }catch (Throwable t){
                em.getTransaction().rollback();
                t.printStackTrace();
            }
        }


    }
}
