/**
 * @author : L.H.J
 * @File: DEP
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public @interface DEP {
    int batch() default 12;
    int studentCount();
    String [] studentNames() default {};

}
