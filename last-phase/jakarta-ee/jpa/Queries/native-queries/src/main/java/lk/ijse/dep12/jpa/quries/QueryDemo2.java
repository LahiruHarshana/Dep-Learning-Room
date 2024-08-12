package lk.ijse.dep12.jpa.quries;

import jakarta.persistence.*;
import lk.ijse.dep12.jpa.quries.entity.Customer;
import lk.ijse.dep12.jpa.quries.util.JpaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
public class QueryDemo2 {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            try {
                transaction.begin();

                //1st choice
                Query nativeQuery2 = em.createNativeQuery("SELECT * FROM CUSTOMER", Customer.class);
                List<Customer> customerList2 = nativeQuery2.getResultList();
                customerList2.forEach(System.out::println);

                //2nd choice
                Query nativeQuery = em.createNativeQuery("SELECT * FROM CUSTOMER");
                List<Object[]> customerList = nativeQuery.getResultList();
                customerList.forEach(System.out::println);
                for (Object[] row : customerList){
                    System.out.println(Arrays.toString(row));
                }

                //Last Choice
                Query nativeQuery3 = em.createNativeQuery("SELECT * FROM CUSTOMER", Tuple.class);
                List<Tuple> customerList3 = nativeQuery3.getResultList();
                customerList3.forEach(System.out::println);
                for (Tuple tuple : customerList3){
                    System.out.println(tuple);
                }

                transaction.commit();
            }catch (Throwable t){
                transaction.rollback();
                t.printStackTrace();
            }
        }
    }
}
