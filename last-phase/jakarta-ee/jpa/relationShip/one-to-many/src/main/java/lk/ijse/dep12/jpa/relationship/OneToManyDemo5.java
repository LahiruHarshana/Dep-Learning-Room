package lk.ijse.dep12.jpa.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.jpa.relationship.entity.Customer;
import lk.ijse.dep12.jpa.relationship.entity.LawSuite;
import lk.ijse.dep12.jpa.relationship.entity.Lawyer;
import lk.ijse.dep12.jpa.relationship.entity.Order;
import lk.ijse.dep12.jpa.relationship.util.JpaUtil;
import org.hibernate.collection.spi.PersistentBag;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static java.lang.System.out;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/
public class OneToManyDemo5 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();

                Lawyer imantha = new Lawyer("L001", "Imantha");
                Lawyer tharindu = new Lawyer("L002", "Tharindu");
                Lawyer chamika = new Lawyer("L003", "Chamika");

                LawSuite ls001 = new LawSuite("LS-001", "Criminal", "Panadura shooting", Date.valueOf(LocalDate.now()),imantha,Date.valueOf(LocalDate.now()),new BigDecimal("25000.00"));
                LawSuite ls002 = new LawSuite("LS-002", "Criminal", "Sappa ge sapa kema", Date.valueOf(LocalDate.now()));
                LawSuite ls003 = new LawSuite("LS-003", "Criminal", "BoralasGamuwa shooting", Date.valueOf(LocalDate.now()),imantha,Date.valueOf(LocalDate.now()),new BigDecimal("15000.00"));
                LawSuite ls004 = new LawSuite("LS-004", "Family", "Divorce shooting", Date.valueOf(LocalDate.now()),tharindu,Date.valueOf(LocalDate.now()),new BigDecimal("45000.00"));

                List.of(chamika,tharindu,imantha,ls001,ls002,ls003,ls004).forEach(em::persist);

                tx.commit();
            }catch (Throwable t){
                tx.rollback();
                t.printStackTrace();
            }
        }
    }
}
