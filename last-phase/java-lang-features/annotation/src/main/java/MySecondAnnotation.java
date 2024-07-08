import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: MySecondAnnotation
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface MySecondAnnotation {
    public static final int x = 10;
    public static class Customer{}
    public static enum MyEnum{}
    public static record MyRecord(){}
    public static interface MyTopLevelInterface{}
    int marks() default 10;
    int marks2() default 10 + 20;

//    int marks3() default MyUtilityClass.add(20,30);
    String name() default "Tharindu";
}
class MyUtilityClass{
    static int add (int num1 ,int num2 ){
        return num1+ num2;
    }
}