package lk.ijse.dep12.jpa.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.jpa.crud.entity.Student;
import lk.ijse.dep12.jpa.crud.util.JpaUtil;

/**
 * @author : L.H.J
 * @File: UpdateDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-11, Thursday
 **/
public class UpdateDemo {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            try {
                Student s001 = em.find(Student.class, "S001");
                s001.setContact("093-9033300");
                em.getTransaction().commit();
            }catch (Throwable t){
                em.getTransaction().rollback();
                t.printStackTrace();
            }
        }
    }
}
