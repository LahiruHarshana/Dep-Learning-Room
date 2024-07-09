import java.lang.reflect.Field;

/**
 * @author : L.H.J
 * @File: ReflectionDemo2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class ReflectionDemo2 {
    public static void main(String[] args) {
//        Field[] fields = Child.class.getFields();
        Field[] declaredFields = Child.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
}
class Parent{

}

class Child extends Parent{
    private int k;
    public int m;
}
