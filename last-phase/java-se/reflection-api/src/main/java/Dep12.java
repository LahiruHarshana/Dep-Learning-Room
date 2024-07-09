import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: Dep12
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/

@Retention(RetentionPolicy.RUNTIME)
public @interface Dep12 {
    String startingDate();
    int duration() default 6;
}
