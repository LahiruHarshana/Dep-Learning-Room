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
public class OneToOneDemo1 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager()) {
            System.out.println("EntityManagerFactory :"+emf);
            System.out.println("EntityManager :" + em);

            em.getTransaction().begin();

            try {
                Employee tharindu = new Employee("E001","Tharindu","Galle","071-8334554");
                Spouse sumanalatha = new Spouse("S001","Sumanalatha","011-21122",tharindu);


                Employee imantha = new Employee("E002","Imantha","Rathnapura",null);
                Spouse senehelatha = new Spouse("S002","senehelatha","011-21122",imantha);

                Employee chamika = new Employee("E003","Chamika","Kandy","033442233");

                List.of(tharindu,sumanalatha,imantha,senehelatha,chamika).forEach(em::persist);
                em.getTransaction().commit();
            }catch (Throwable e){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
