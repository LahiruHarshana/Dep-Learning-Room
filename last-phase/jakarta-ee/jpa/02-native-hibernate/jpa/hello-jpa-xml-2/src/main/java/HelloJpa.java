import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

/**
 * @author : L.H.J
 * @File: HelloJpa
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class HelloJpa {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
            EntityManager em = emf.createEntityManager()){
            System.out.println("Entity Manager Factory : " + emf);
            System.out.println("Entity Manager : " + em);
        }
    }
}
