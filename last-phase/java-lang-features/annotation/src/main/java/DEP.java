import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author : L.H.J
 * @File: DEP
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/



@Target({ElementType.FIELD})
public @interface DEP {
    int batch() default 12;
    int studentCount();
    String [] studentNames() default {};

}
