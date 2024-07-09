import com.sun.jdi.event.StepEvent;

/**
 * @author : L.H.J
 * @File: MyNormalAnnotation
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public @interface MyNormalAnnotation {
    String id() default "S001";
    String name() default "Lahiru";
}
